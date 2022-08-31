package com.atguigu.SE8.REGEXPTest;

import java.util.Scanner;

/**
 * @Description: TODO
 * @BelongsProject: _01_JavaSE
 * @BelongsPackage: com.atguigu.SE8.REGEXPTest01
 * @Version: 1.0
 * @CreateTime: 2022-08-26 11:15:11
 * @Author: 02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
public class REGEXPTest01 {
    public static void main(String[] args) {

        //一个邮箱的正则...236234686@qq.com
        // 约束: 1.0不能够1开始 2.0八位可以1-9 3.0加一个"@"符号 4.0公司的域名,必须全英文,限制在6个以内 5.0加一个"." 6.0英文域名后缀限制为3位

        String regexp01 = "[2-9]\\d{8}[@]\\w{1,6}[.]\\w{2,3}";

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入..O(∩_∩)O哈哈~");

        String s = scanner.nextLine();

        boolean matches = s.matches(regexp01);

        System.out.println(matches?"nice!nice!!🤣🤣":"Fuck!Fuck!!🎃🎃");

    }
}
