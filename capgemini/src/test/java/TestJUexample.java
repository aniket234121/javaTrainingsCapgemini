//import JUnit.Example;
//import com.scoping.PrimeNo;
//import org.junit.*;
//
//
//public class TestJUexample {
//    @Test
//    public void check(){
//        PrimeNo p=new PrimeNo();
//        Assert.assertEquals(true,p.primeNo(3));
//    }
//    @Test
//    public void check2(){
//        Example e=new Example();
//        Assert.assertEquals(8,e.pow(2,3),0.01);
//    }
//    @Test
//    public void div(){
//        Example e=new Example();
//        Assert.assertEquals(0,e.div(2,3));
//    }
//    @Test(expected = ArithmeticException.class)
//    public void divByZero()
//    {
//        Example e=new Example();
//        e.div(2,0);
//    }
//    @Before
//    public void before()
//    {
//        System.out.println("before every test");
//    }
//    @After
//    public void after(){
//        System.out.println("after every test");
//    }
//    @AfterClass
//    public static void afterClass(){
//        System.out.println("after class test (close connection)");
//    }
//    @BeforeClass
//    public static void beforeClass(){
//        System.out.println("before class test( establish connection)");
//    }
//
//}
