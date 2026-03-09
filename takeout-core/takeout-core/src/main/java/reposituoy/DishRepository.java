package reposituoy;



import com.Bianca.takeoutcore.entity.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishRepository extends JpaRepository<Dish, Long> {
    // 可以添加自定义查询方法
}