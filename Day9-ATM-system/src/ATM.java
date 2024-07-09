import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATM {
    private ArrayList<Account> accounts = new ArrayList<>();  //使用集合存储全部用户的账户信息
    private Scanner sc = new Scanner(System.in);
    private Account loginAcc; //记录登陆后的用户账户信息
    /**启动系统，展示欢迎界面*/
    public void start(){

        while (true) {
            System.out.println("===欢迎进入ATM系统==");
            System.out.println("1、用户登录");
            System.out.println("2、用户开户");
            System.out.println("请选择：");
            String com = sc.next();
            switch (com){
                case "1":
                    //用户登录
                    login();
                    break;
                case "2":
                    //用户开户
                    create();
                    break;
                default:
                    System.out.println("没有该操作");
            }
        }
    }

    /** 用户开户功能 */
    private void create(){
        //1、创建一个账户对象，封装用户信息
        Account acc = new Account();
        //2、需要用户输入自己的信息，赋值给账户对象
        System.out.println("请输入账户名称");
        String name  = sc.next();
        acc.setUserName(name);

        while (true) {
            System.out.println("请输入您的性别");
            char sex = sc.next().charAt(0); //间接取字符
            if(sex == '男' || sex == '女'){
                acc.setSex(sex);
                break;  //输入正确才跳出死循环
            }else{
                System.out.println("您输入的性别有误，请选择：男/女");
            }
        }

        while (true) {
            System.out.println("请设置账户密码：");
            String password = sc.next();
            System.out.println("请确认账户密码：");
            String okpassword = sc.next();
            //判断两次密码是否相同
            if(okpassword.equals(password)){
                acc.setPassword(okpassword);
                break;
            }else {
                System.out.println("输入的密码不一致，请重新确认");
            }
        }

        System.out.println("请输入您的取现额度：");
        double limit = sc.nextDouble();
        acc.setLimit(limit);

        //**为该账号生成一个卡号（系统自动生成8位）且不与其他账号重复**//
        String newID = createcardId();
        acc.setCardId(newID);

        //3、把这个账户对象，存入到账户集合中去
        accounts.add(acc);
        System.out.println("恭喜您" + acc.getUserName() + "开户成功，您的卡号是：" + acc.getCardId());

    }

    /** 返回一个8位数字卡号*/
    private String createcardId(){
        while (true) {
            //1、定义一个String变量记住8为数字
            String Id = "";
            //2、使用循环，将得到的8位随机数连起来
            Random r = new Random();
            for (int i = 0; i < 8; i++) {
                int data = r.nextInt(10); //0-9
                Id += data;
            }
            //3、判断是否重复号码
            Account acc = getAccBycardId(Id);
            if(acc == null){
                //说明没找到，是新卡号
                return Id;
            }
        } // 如果重复了则系统再次生成一次，直到通过if语句返回出去结束运行

    }

    /** 根据卡号查询账户对象返回*/
    private Account getAccBycardId(String CardId){
        //account = [c1, c2, c3,...]
        //1、遍历全部账户对象
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            // 2、判断该账户卡号是否是我们要找的卡号
            if(acc.getCardId().equals(CardId)){
                return acc;
            }
        }
        return null; //账号不存在
    }

    /** 完成用户的登录 */
    private void login(){
        System.out.println("==系统登陆==");
        //1、判断系统中是否存在该账户，存在才能登录，否则直接结束登录操作
        if(accounts.size() == 0){
            System.out.println("系统中无账号，请先去开户吧");
            return; //跳出登录操作
        }

        // 2、系统中有账户，可以进行登陆操作
        while (true) {
            System.out.println("请输入卡号");
            String cardid = sc.next();

            //3、判断卡号是否存在
            Account acc = getAccBycardId(cardid);
            if(acc == null){
                //说明卡号不存在
                System.out.println("输入的卡号不存在，请确认");
            }else {
                while (true) {
                    //卡号存在，接着输入密码
                    System.out.println("请您输入密码：");
                    String password = sc.next();
                    //4、判断密码是否正确
                    if(acc.getPassword().equals(password)){
                        loginAcc = acc;
                        //密码正确，登陆成功
                        System.out.println("恭喜您" + acc.getUserName() + "成功登录，您的卡号是：" + cardid);
                        //展示登录后操作界面
                        showUsercommand();
                        return; //跳出并结束当前登录login()方法，回到欢迎页
                    }else{
                        System.out.println("输入的密码错误，请重试");
                    }
                }
            }
        }
    }

    /** 展示登陆后的操作界面 */
    private void showUsercommand(){
        while (true) {
            System.out.println(loginAcc.getUserName() + "您可以选择如下功能进行账户的处理====");
            System.out.println("1、查询账户");
            System.out.println("2、存款");
            System.out.println("3、取款");
            System.out.println("4、转账");
            System.out.println("5、修改密码");
            System.out.println("6、退出账户");
            System.out.println("7、注销账户");
            int com = sc.nextInt();
            switch (com){
                case 1 :
                    //查询
                    showloginAcc();
                    break;
                case 2:
                    //存款
                    depositMoney(); //alt + enter，快速创建方法
                    break;
                case 3:
                    //取款
                    drawmoney();
                    break;
                case 4:
                    //转账
                    transfermoney();
                    break;
                case 5:
                    //修改密码
                    updatepassword();
                    return; //跳出该方法，回到欢迎页
                case 6:
                    //退出账户
                    System.out.println(loginAcc.getUserName() + "您退出系统成功");
                    return; //直接退出该方法,回到欢迎页
                case 7:
                    //注销账户
                    if(deleteacc()){
                        //销户成功，回到欢迎页
                        return;
                    }
                    //销户失败只是跳出switch语句，会继续在登录后页面循环
                    break;
                default:
                    System.out.println("操作不存在，请重新选择");
            }
        }
    }

    /** 修改密码 */
    private void updatepassword() {
        System.out.println("==修改账户密码==");
        while (true) {
            //1、提醒用户认证当前密码
            System.out.println("请您输入当前账户密码：");
            String password = sc.next();
            //2、认证当前密码是否输入正确
            if(loginAcc.getPassword().equals(password)){
                while (true) {
                    //3、认证通过，输入新密码
                    System.out.println("请您输入新密码");
                    String newpassword = sc.next();

                    System.out.println("请您再次确认新密码：");
                    String okpassword = sc.next();

                    //4、确认两次输入相同
                    if(newpassword.equals(okpassword)){
                        //可以修改了
                        loginAcc.setPassword(okpassword);
                        System.out.println("密码修改成功");
                        return; //跳出修改密码方法
                    }else {
                        System.out.println("输入的密码不一致");
                    }
                }

            }else {
                System.out.println("输入的当前密码不正确");
            }
        }
    }

    /** 销户 */
    private boolean deleteacc() {
        System.out.println("==正在进行销户==");
        //1、先确认是否要销户
        System.out.println("请问您确认销户吗？ y/n");
        String com = sc.next();
        switch (com){
            case "y":
                //确实要销户
                //2、判断用户中是否还有余额
                if(loginAcc.getMoney() == 0){
                    //可以销户了
                    accounts.remove(loginAcc);
                    System.out.println("您的账户已销户");
                    return true;
                }else {
                    System.out.println("账户中还有存款，不允许销户");
                    return false;
                }
//                break; //可以省略了，在前面return就返回了，运行不到break
            default:
                System.out.println("好的，账户保留");
                return false;
        }
    }

    /** 用户转账 */
    private void transfermoney() {
        //1、判断系统是否有其他账户
        if(accounts.size() < 2){
            System.out.println("当前系统只有一个账户，无法转账");
            return;
        }

        //2、判断自己账户是否有钱
        if(loginAcc.getMoney() == 0){
            System.out.println("余额为0，无法转账");
            return;
        }

        //3、可以转账了
        System.out.println("请输入对方的卡号：");
        String cardId = sc.next();

        //4、判断卡号是否正确
        Account acc = getAccBycardId(cardId);
        if(acc == null){
            System.out.println("您输入的账号不存在");
        }else {
            //5、账号存在，认证对方姓氏
            String name = "*" + acc.getUserName().substring(1); //将用户姓名第一个字遮盖
            System.out.println("请您输入【" + name + "】的姓氏");
            String prename = sc.next();
            //判断用户输入的姓氏是否正确
            if(acc.getUserName().startsWith(prename)) {
                //认证通过
                while (true) {
                    System.out.println("请输入转账金额：");
                    double money = sc.nextDouble();
                    //6、判断余额是否充足
                    if(loginAcc.getMoney() >= money){
                        //转给对方
                        //更新自己的账户余额
                        loginAcc.setMoney(loginAcc.getMoney() - money);
                        //更新对方余额
                        acc.setMoney(acc.getMoney() + money);
                        System.out.println("转账已成功");
                        return; //跳出转账方法
                    }else {
                        System.out.println("余额不足，最多可以转：" + loginAcc.getMoney() + "元");
                    }
                }
            }else {
                System.out.println("输入的姓氏有问题");
            }

        }
    }

    /** 取钱 */
    private void drawmoney() {
        System.out.println("==取钱操作==");
        //1、判断账户余额是否达到100元，不够则不支持取钱

            if(loginAcc.getMoney() < 100){
                System.out.println("您的账户余额不足100元，不允许取钱");
                return;
            }

            //2、让用户输入取款金额
        while (true) {
            System.out.println("请输入您的取款金额：");
            double money = sc.nextDouble();

            //3、判断账户余额是否足够
            if(loginAcc.getMoney() >= money){
                //余额充足
                //4、先判断取款金额是否超过限额
                if(money > loginAcc.getLimit()){
                    System.out.println("当前取款金额已超过限额：" + loginAcc.getLimit() + "元");
                }else {
                    // 代表可以取钱，更新账户余额即可
                    loginAcc.setMoney(loginAcc.getMoney() - money);
                    System.out.println("您取款：" + money + "元成功，当前余额：" + loginAcc.getMoney());
                }
            }else {
                //余额不足
                System.out.println("余额不足，您的账户余额是：" + loginAcc.getMoney());  //取钱失败，等待用户重新输入取款金额
            }
        }
    }

    /** 存钱 */
    private void depositMoney() {
        System.out.println("==存钱操作==");
        System.out.println("请输入存款金额：");
        double money = sc.nextDouble(); //实际应用中，不用考虑负数

        //更新当前账户的余额
        loginAcc.setMoney(loginAcc.getMoney() + money);
        System.out.println("恭喜您，存款： " + money + "元成功,当前余额：" + loginAcc.getMoney() + "元");
    }

    /** 展示当前登录的账户信息*/
    private void showloginAcc(){
        System.out.println("==当前您的账户信息：==");
        System.out.println("卡号： " + loginAcc.getCardId());
        System.out.println("户主： " + loginAcc.getUserName());
        System.out.println("提现额度： " + loginAcc.getLimit());
        System.out.println("余额： " + loginAcc.getMoney());
    }

    /**  */

}
