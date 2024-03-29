package Crud.noticeBoard.Controller;

import Crud.noticeBoard.Dto.BoardDto;
import Crud.noticeBoard.Service.BoardService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class BoardController {
    private BoardService boardService;

    @GetMapping("/")
    public String list(){
        return "board/list.html";
    }
    @GetMapping("/post")
    public String write(){
        return "board/write.html";
    }
    @PostMapping("/post")
    public String write(BoardDto boardDto){
        boardService.savePost(boardDto);

        return "redirect:/";
    }
}
