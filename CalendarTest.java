import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @version 2019/3/28
 * @author LD
 * 本月日历   p101
 */
public class CalendarTest {

    public static void main(String[] args) {
        //初始化
        LocalDate date= LocalDate.now();
        //获取月、日
        int month =date.getMonthValue();
        int today = date.getDayOfMonth();
        //设置为本月第一天
        // minu -  之前几天
        date =date.minusDays(today-1);
        //月初是星期几
        DayOfWeek weekday=date.getDayOfWeek();
        //星期一到星期日  1-7
        int value =weekday.getValue();
        //表头
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        //判定位置
        for(int i=1;i<value;i++)
        {
            //四个空格
            System.out.print("    ");
        }
        //判定  是否在本月  是：继续  不是：结束循环
        while (date.getMonthValue() == month){
            //printf  格式化
            System.out.printf("%3d",date.getDayOfMonth());
            if(date.getDayOfMonth() == today){
                //标记今天
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
            //明天
            // plus +  之后几天
            date=date.plusDays(1);
            //明天是不是周一
            if(date.getDayOfWeek().getValue()==1){
                //是：换行
                System.out.println();
            }
        }
        if(date.getDayOfWeek().getValue()!=1){
            System.out.println();
        }
    }
}
