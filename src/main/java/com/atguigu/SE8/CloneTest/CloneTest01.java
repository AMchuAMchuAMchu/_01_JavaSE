package com.atguigu.SE8.CloneTest;

import com.atguigu.SE8.CloneTest.bean.SummerVacation;

import java.lang.reflect.Method;

/**
 * @Description: TODO
 * @BelongsProject: _01_JavaSE
 * @BelongsPackage: com.atguigu.SE8.CloneTest
 * @Version: 1.0
 * @CreateTime: 2022-08-26 12:35:31
 * @Author: 02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
public class CloneTest01 {

    public static void main(String[] args) throws Exception {

        SummerVacation summerVacation2 = new SummerVacation();

        SummerVacation summerVacation = new SummerVacation(new String[]{"SAO刀剑神域","fate/型月世界","在地下城邂逅是否错过了什么.."},202207);

        System.out.println("01>"+summerVacation2);

//        Class<SummerVacation> svc = SummerVacation.class;

//        Class<? extends SummerVacation> svc = summerVacation.getClass();
//
//        SummerVacation summerVacation1 = svc.newInstance();
//
//        Method declaredMethod = svc.getDeclaredMethod("clone");
//        declaredMethod.setAccessible(true);
//
//        Object invoke = declaredMethod.invoke(summerVacation1);

        Object clone = summerVacation.clone();

        System.out.println("02>"+clone);


    }

}
