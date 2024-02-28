package sample.Controller;

import sample.Controller.Entity.User;
import sample.Controller.inDto.UserRequestinDto;
import sample.Controller.service.CudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/crud")
public class CrudQry {

    private final CudService cudService;

    @Autowired
    public CrudQry(CudService memberService) {
        this.cudService = memberService;
    }

    @PostMapping("/insert")
    public ResponseEntity<String> insertData(@RequestBody UserRequestinDto userRequestinDto) {

        //JSON 형태 인풋값 받아와서 User Entity에 세팅
        User user = new User();
        user.setUsername(userRequestinDto.getUsername());
        user.setEmail(userRequestinDto.getEmail());

        //세팅된 User Entity 값으로 테이블 인서트
        cudService.insert(user);

        return ResponseEntity.ok("데이터가 성공적으로 삽입되었습니다.");
    }

    @PostMapping("/update")
    public ResponseEntity<String> updateData(@RequestBody UserRequestinDto userRequestinDto) {

        //JSON 형태 인풋값 받아와서 User Entity에 세팅
        User user = new User();
        user.setUser_id(userRequestinDto.getUser_id());
        user.setUsername(userRequestinDto.getUsername());
        user.setEmail(userRequestinDto.getEmail());

        //세팅된 User Entity의 user_id 값을 기준으로 userName 이름 변경 업데이트
        cudService.update(user);

        return ResponseEntity.ok("데이터가 성공적으로 삽입되었습니다.");
    }
}

