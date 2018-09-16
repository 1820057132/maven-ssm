package com.neusoft.SSMTest.service.impl;

import com.neusoft.SSMTest.bean.Game;
import com.neusoft.SSMTest.mapper.GameMapper;
import com.neusoft.SSMTest.service.IGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by xhbg on 2018/9/12.
 */
@Service("gameServiceImpl")
@Transactional
public class GameServiceImpl implements IGameService {

    @Autowired
    GameMapper gameMapper;

    
    public Game selectOne(Game game) {
        return gameMapper.selectOne(game);
    }


    public List<Game> selectAll(Game game) {
        return gameMapper.selectAll(game);
    }

    public Integer insert(Game game) {
        return gameMapper.insert(game);
    }

    public Integer update(Game game) {
        return gameMapper.deleteByPK(game);
    }

    
    public Integer deleteByPK(Game game) {
        return null;
    }
}
