package com.neusoft.SSMTest.controller;

import com.alibaba.fastjson.JSONObject;
import com.neusoft.SSMTest.bean.Game;
import com.neusoft.SSMTest.service.IGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xhbg on 2018/9/12.
 */
@Controller
@RequestMapping("game")
public class GameController {

    @Autowired
    IGameService gameService;

    @RequestMapping(value = "getName",produces = "text/plain;charset=utf-8")
    @ResponseBody
    public String getGameNameByid(Integer id){
        Game game = new Game();
        game.setId(id);
        game = gameService.selectOne(game);
        return JSONObject.toJSONString(game);
    }

}
