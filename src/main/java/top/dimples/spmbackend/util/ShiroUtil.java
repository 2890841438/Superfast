package top.dimples.spmbackend.util;


import org.apache.shiro.SecurityUtils;
import top.dimples.spmbackend.shiro.AccountProfile;

public class ShiroUtil {

    public static AccountProfile getProfile() {
        return (AccountProfile) SecurityUtils.getSubject().getPrincipal();
    }

}
