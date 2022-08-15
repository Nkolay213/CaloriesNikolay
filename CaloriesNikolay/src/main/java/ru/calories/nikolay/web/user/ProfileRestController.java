package ru.calories.nikolay.web.user;

import org.springframework.stereotype.Controller;
import ru.calories.nikolay.model.User;
import ru.calories.nikolay.web.SecurityUtil;

@Controller
public class ProfileRestController extends AbstractUserController {

    public User get() {
        return super.get(SecurityUtil.authUserId());
    }

    public void delete() {
        super.delete(SecurityUtil.authUserId());
    }

    public void update(User user) {
        super.update(user, SecurityUtil.authUserId());
    }
}