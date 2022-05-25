package org.example.controller;

import com.mongodb.client.ListDatabasesIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.bson.Document;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/time")
    @ResponseBody   // needed because @Controller annotation instead @RestController
    public String getTime() {
        String time = ZonedDateTime.now(ZoneId.of("Europe/Vienna")).format(DateTimeFormatter.ISO_DATE_TIME);
        String time2 = String.valueOf(LocalDateTime.now());
        return "Hello, it's " + time;
    }

    @RequestMapping("/database")
    @ResponseBody
    public String checkMongoDb() {
        var result = testDatabaseConnection();
        return "MongoDB: " + result;
    }

    private ListDatabasesIterable<Document> testDatabaseConnection() {
        MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");

        try {
            return mongoClient.listDatabases();
        } catch (Exception e) {
            System.out.println("Mongo is down");
            mongoClient.close();
        }
        return null;
    }

}

