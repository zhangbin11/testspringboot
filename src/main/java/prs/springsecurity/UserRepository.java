package prs.springsecurity;

import org.springframework.data.jpa.repository.JpaRepository;
import prs.model.UserEntity;

/**
 * 标题、简要说明.
 * <p>
 * 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2018-08-30 15:37
 * <p>
 * Company: 斑马快跑
 * <p>
 *
 * @author zhangbin
 * @email zhangbin@bmkp.cn
 */
public interface UserRepository extends JpaRepository<UserEntity, Integer> {


}
