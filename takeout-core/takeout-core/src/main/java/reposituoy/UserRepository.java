package reposituoy;

import com.Bianca.takeoutcore.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // 根据手机号查询用户（后面登录要用）
    User findByPhone(String phone);
}

