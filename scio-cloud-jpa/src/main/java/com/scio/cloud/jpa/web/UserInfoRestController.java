package com.scio.cloud.jpa.web;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scio.cloud.jpa.domain.enums.UserStatus;
import com.scio.cloud.jpa.service.UserInfoService;
import com.scio.cloud.jpa.web.vo.UserInfoVo;

/**
 * user info controller
 *
 * @author Wang.ch
 * @date 2019-03-25 09:24:37
 */
@RestController
public class UserInfoRestController {
  @Autowired private UserInfoService userinfo;
  /**
   * find user info by id
   *
   * @param id
   * @return
   */
  @RequestMapping("/{id}")
  public UserInfoVo findById(@PathVariable(name = "id") Long id) {
    return userinfo.findById(id);
  }
  /**
   * save user info
   *
   * @return
   */
  @RequestMapping("/save")
  public UserInfoVo save() {
    UserInfoVo vo = new UserInfoVo();
    vo.setUsername(RandomStringUtils.randomAlphabetic(12));
    vo.setPassword(RandomStringUtils.randomAlphabetic(12));
    vo.setRealname(RandomStringUtils.random(5, true, false));
    vo.setStatus(UserStatus.NORMAL);
    vo = userinfo.save(vo);
    return vo;
  }

  /**
   * save user info
   *
   * @return
   */
  @RequestMapping("/batchSave")
  public List<UserInfoVo> batchSave() {
    List<UserInfoVo> userinfos =
        Stream.of(1, 2, 3)
            .map(
                i -> {
                  UserInfoVo vo = new UserInfoVo();
                  vo.setUsername(RandomStringUtils.randomAlphabetic(12));
                  vo.setPassword(RandomStringUtils.randomAlphabetic(12));
                  vo.setRealname(RandomStringUtils.random(5, true, false));
                  vo.setStatus(UserStatus.NORMAL);
                  return vo;
                })
            .collect(Collectors.toList());
    return userinfo.save(userinfos);
  }
  /**
   * find user info
   *
   * @param username
   * @return
   */
  @RequestMapping("/find")
  public UserInfoVo findByUsername(String username) {
    UserInfoVo vo = userinfo.findByUsername(username);
    return vo;
  }
}
