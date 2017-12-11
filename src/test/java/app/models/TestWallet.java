package app.models;

import app.exception.Over5000BalanceException;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class TestWallet {

    private Wallet wallet;

    public TestWallet() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
//        injectData
    }

    @After
    public void tearDown() throws Exception {
//        clearAll
    }

    @AfterClass
    public static void tearDownClass() throws Exception {

    }

    @Test
    public void testCurrentBalanceShouldBeTwentyBath() {
        wallet = new Wallet(1);
        Assert.assertEquals(2000, wallet.getBalance(), 2000);
    }

    @Test
    public void testTopupShouldAllowToTopupBalanceLessThan5000() throws Over5000BalanceException {
        wallet = new Wallet(1);
        Assert.assertEquals(true, wallet.addBalance(10));
    }

    @Test
    public void testTopupShouldAllowToTopupBalanceEqual5000() throws Over5000BalanceException {
        wallet = new Wallet(1);
        Assert.assertEquals(true, wallet.addBalance(10));
    }

    @Test(expected = Over5000BalanceException.class)
    public void testTopupShouldNotAllowToTopupBalanceOver5000() throws Over5000BalanceException {
        wallet = new Wallet(1);
        wallet.addBalance(5050);
    }

}
