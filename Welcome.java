public class Welcome {

    /**
     * 2019/3/21 LD
     */
    public static void main(String[] args) {
        String greeting ="Welcome to Core Java!";
        System.out.println(greeting);
        //还以为这个循环有什么用：还挺好看
        //单句if/for代码不要省略{}，开发中算个bug
        for(int i=0;i<greeting.length();i++)
            System.out.print("=");
        System.out.println();
    }
}
