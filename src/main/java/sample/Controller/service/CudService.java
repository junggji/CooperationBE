package sample.Controller.service;

import sample.Controller.Entity.User;
import sample.Controller.Repository.JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional   //트랜잭션 어노테이션은 CUD기능에 넣어줘야함 그래야 서비스 호출 오류 있을때 데이터 롤백 가능
@RequiredArgsConstructor   //롬복 기능으로 final로 선언된 필드를 가지고 생성자를 자동으로 생성,@Autowired 생략가능
public class CudService {

    private final JpaRepository jpaRepository;

    public String insert(User user) {

        String.valueOf(jpaRepository.save(user));

        return "인서트 성공";
    }

    public String update(User user) {

        User existingUser = jpaRepository.findById(user.getUser_id())
                .orElseThrow(() -> new RuntimeException("User not found"));

        // 필요한 변경 수행
        existingUser.setUsername(user.getUsername());

        // 엔티티 업데이트
        jpaRepository.save(existingUser);

        return "업데이트 성공";
    }
}
