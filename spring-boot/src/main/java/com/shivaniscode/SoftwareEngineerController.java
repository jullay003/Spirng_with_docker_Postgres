package com.shivaniscode;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/sofware-engineers")
public class SoftwareEngineerController {

    @GetMapping
    public List<SoftwareEngineer> getEngineers(){
        return List.of(
                new SoftwareEngineer(
                        1,
                        "Shivani",
                        "Java, Springboot, maven, redis, docker, aws"
                ),
                new SoftwareEngineer(
                        2,
                        "MishrA",
                        "React, node, AntD, Mantine, Expressja, MERN stack, Vue,js"
                )
        );
    }
}
