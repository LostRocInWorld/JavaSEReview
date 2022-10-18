package com.dustin.project3.junit;

import com.dustin.project3.service.NameListService;
import com.dustin.project3.service.TeamService;
import org.junit.Test;

/**
 * @Project JavaSEReview
 * @Package com.dustin.project3.team.junit
 * @ClassName TeamServiceTest
 * @Description TeamServiceTest
 * @Date 2022/9/27   03:25
 * @Created by Dustin_Peng
 */
public class TeamServiceTest {
    @Test
    public void testgetTeam(){
        NameListService nameService = new NameListService();
        TeamService teamService = new TeamService();
        teamService.getTeam();
    }

    @Test
    public void testAddMember(){
        NameListService nameService = new NameListService();
        TeamService teamService = new TeamService();
        teamService.addMember(nameService.getEmployee(3));
//        teamService.getTeam();

    }
}
