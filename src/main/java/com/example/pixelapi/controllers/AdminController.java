package com.example.pixelapi.controllers;

import com.example.pixelapi.entity.Appointment;
import com.example.pixelapi.entity.Role;
import com.smattme.MysqlExportService;
import org.apache.juli.logging.Log;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api/teacher")
public class AdminController {
    private DBController db = new DBController();
    Logger logger = Logger.getLogger("Teache");

    @GetMapping("/getAppointments")
    public ResponseEntity<List<Appointment>> getAllSchedule(@RequestParam(name = "date", required = false) String date, @RequestParam("id") int id) throws Exception {
        List<Appointment> list = new ArrayList<>();
        HashMap<String,String> map = new HashMap<>();
        if(date != null){
            map.put("date", "WEEK(date) = WEEK('"+date+"') and YEAR(date) = YEAR('"+date+"')");
        }
        ResultSet set = db.selectFromTable("fullappointment", Appointment.class, map);
        logger.info("ID - "+id);
        if(set != null)
            while (set.next()){
                logger.info(set.getInt(8)+"");
                if(set.getInt(8) == id)
                    list.add(new Appointment(
                            set.getInt(1),
                            set.getString(2),
                            set.getInt(3),
                            set.getString(4),
                            set.getString(5),
                            set.getString(6),
                            set.getDate(7),
                            set.getInt(8),
                            set.getInt(9),
                            set.getInt(10),
                            set.getString(11)
                ));
            }
        return ResponseEntity.ok(list);
    }
}
