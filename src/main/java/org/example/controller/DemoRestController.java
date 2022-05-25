package org.example.controller;

import org.springframework.boot.system.JavaVersion;
import org.springframework.boot.system.SystemProperties;
import org.springframework.core.SpringVersion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoRestController {

    @GetMapping("/version")
    public String hello() {
        return SystemProperties.get("java.version") + "\n" + JavaVersion.getJavaVersion().toString() + "\n" + SpringVersion.getVersion() + "\n";
    }
}
