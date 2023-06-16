import Process.*;

public class Main {
    public static void main(String[] args) {
        processMenu pm=new processMenu();
        pm.init();//初始化容器
        pm.SJF();pm.printProcess();
        pm.RR();pm.printProcess();

    }
}