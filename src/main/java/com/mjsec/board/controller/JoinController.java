package com.mjsec.board.controller;

import com.mjsec.board.Dto.JoinDto;
import com.mjsec.board.service.JoinService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@ResponseBody
public class JoinController {
    private final JoinService joinService;
    public JoinController(JoinService joinService) {
        this.joinService = joinService;
    }

    @PostMapping("/join")
    public String joinProcess(JoinDto joinDto) {

        System.out.println(joinDto.getUsername());
        joinService.joinProcess(joinDto);

        return "ok";
    }
}
