package com.playdata.service;

import com.playdata.dao.BoardDao;
import com.playdata.dto.BoardDto;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class BoardService {
    public List<BoardDto> getBoards(HttpServletRequest req) {
        BoardDao boardDao = new BoardDao();
        return boardDao.selectAll(req);

    }
}
