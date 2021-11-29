import java.util.*;
public class twoD_Arrays_Project{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[][] arr = {
            {"    Crpyto Currencies  |    Feb '21    |    Mar '21    |    Apr '21    |   May '21    |    Jun '21    |    Jul '21    |    Aug '21    |    Sep '21    |    Oct '21    |    Nov '21    "},
            {"    Bitcoin(BTC)       |    $34,638.21 |    $49,784.02 |    $59,586.07 |   $58,448.34 |    $37,896.74 |    $35,035.98 |    $42,541.68 |    $49,111.09 |    $48,436.01 |    $62,419.00 "},
            {"    Ethereum(ETH)      |    $1,373.85  |    $1,567.69  |    $1,989.06  |   $2,951.44  |    $2,739.74  |    $2,274.40  |    $2,695.43  |    $3,836.87  |    $3,329.85  |    $4,377.32  "}, 
            {"    Binance Coin(BNB)  |    $52.14     |    $259.49    |    $339.21    |   $641.86    |    $364.32    |    $303.53    |    $347.42    |    $490.07    |    $423.34    |    $552.07    "},
            {"    Solana(SOL)        |    $0.42      |    $1.34      |    $1.21      |   $1.37      |    $1.78      |    $1.38      |    $1.39      |    $2.90      |    $2.27      |    $2.02      "},
            {"    Cardano(ADA)       |    $4.61      |    $15.52     |    $20.36     |   $49.84     |    $33.29     |    $35.54     |    $36.72     |    $119.53    |    $164.74    |    $211.36    "},
            {"    XRP(XRP)           |    $0.74      |    $0.45      |    $0.60      |   $1.67      |    $1.10      |    $0.70      |    $0.78      |    $1.23      |    $1.06      |    $1.13      "},
            {"    Polkadot(DOT)      |    $16.52     |    $35.58     |    $38.99     |   $37.36     |    $23.52     |    $16.41     |    $19.87     |    $33.78     |    $32.31     |    $51.47     "},
            {"    Dogecoin(DOGE)     |    $0.04      |    $0.05      |    $0.07      |   $0.40      |    $0.38      |    $0.26      |    $0.22      |    $0.29      |    $0.22      |    $0.29      "},
            {"    SHIBA INU(SHIB)    |    $13.52     |    $27.77     |    $29.30     |   $35.64     |    $18.55     |    $12.07     |    $14.06     |    $45.53     |    $69.44     |    $66.69     "},
            {"    Litecoin(LTC)      |    $136.13    |    $176.36    |    $205.47    |   $278.22    |    $193.00    |    $144.14    |    $149.70    |    $182.72    |    $168.01    |    $200.49    "}    
        };
        double [][] arr1 = {
        {34638.21 ,     49784.02 ,     59586.07 ,    58448.34 ,     37896.74 ,     35035.98 ,     42541.68 ,     49111.09 ,     48436.01 ,     62419.00 },
        {1373.85  ,     1567.69  ,     1989.06  ,    2951.44  ,     2739.74  ,     2274.40  ,     2695.43  ,     3836.87  ,     3329.85  ,     4377.32  }, 
        {52.14     ,    259.49    ,    339.21    ,   641.86    ,    364.32    ,    303.53    ,    347.42    ,    490.07    ,    423.34    ,    552.07    },
        {0.42      ,    1.34      ,    1.21      ,   1.37      ,    1.78      ,    1.38      ,    1.39      ,    2.90      ,    2.27      ,    2.02      },
        {4.61      ,    15.52     ,    20.36     ,   49.84     ,    33.29     ,    35.54     ,    36.72     ,    119.53    ,    164.74    ,    211.36    },
        {0.74      ,    0.45      ,    0.60      ,   1.67      ,    1.10      ,    0.70      ,    0.78      ,    1.23      ,    1.06      ,    1.13      },
        {16.52     ,    35.58     ,    38.99     ,   37.36     ,    23.52     ,    16.41     ,    19.87     ,    33.78     ,    32.31     ,    51.47     },
        {0.04      ,    0.05      ,    0.07      ,   0.40      ,    0.38      ,    0.26      ,    0.22      ,    0.29      ,    0.22      ,    0.29      },
        {13.52     ,    27.77     ,    29.30     ,   35.64     ,    18.55     ,    12.07     ,    14.06     ,    45.53     ,    69.44     ,    66.69     },
        {136.13    ,    176.36    ,    205.47    ,   278.22    ,    193.00    ,    144.14    ,    149.70    ,    182.72    ,    168.01    ,    200.49    }};
        
        String[] months = {"February","March", "April", "May","June","July","August","September","October","November"};
        String[] coins = {"BTC","ETH", "BNB", "SOL","ADA","XRP","DOT","DOGE","SHIB","LTC"};

        System.out.println("Hello! Do you want to see data on some the most popular cryptocurrencies? (Yes or No)");   
        
            
            String yesOrNo = console.next();
            System.out.print("\033[2J\033[1;1H");
            if(yesOrNo.equalsIgnoreCase("no")){
                System.out.println("Oh okay, you can always come back if you do! Have a good day!");
                
            }
            else{

                while(true){
                    String tempAns ="";
                    System.out.print("\033[2J\033[1;1H");
                    System.out.println("Type in the number of any of the choices below and I'll show it to you!(Enter \"stop\" at any time to end the program)\n");
                    System.out.println("1. Print data of every coin\n2. Percent change between two months of any coin\n3. Average cost of any coin over the 10 month period\n4. See how much profit you could make if you put in a specific amount of money in any coin\n5. The worst month to buy a specific coin\n6. The best month to buy a specific coin\n7. Fun Fact about a specific coin");
                    while(true){
                        String ans = console.next();

                        if(ans.equalsIgnoreCase("stop")){
                            tempAns = ans;
                            break;
                        }
                        else if(ans.equalsIgnoreCase("done"))
                            break;
                        else if(ans.equals("1")){
                            printData(arr, console);

                        }
                        else if(ans.equals("2"))
                            perecentChange(arr1, months, console, coins);
                        else if(ans.equals("3"))
                            average(arr1, coins, console); 
                        else if(ans.equals("4"))
                            profit(arr1, coins, console);
                        else if(ans.equals("5"))
                            worstMonth(arr1, coins, months, console);
                        else if(ans.equals("6"))
                            bestMonth(arr1, coins, months, console);
                        else if(ans.equals("7"))
                            funFacts(coins, console);
                        }
                    if(tempAns.equalsIgnoreCase("stop"))
                        break;
                }
                
            }
    }   
    
    public static void printData(String [][] arr, Scanner console){
        for(int i = 0; i < arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("Type in \"Done\" to go back to the main screen");
            
    }

    public static void perecentChange(double [][] arr1, String[] months, Scanner console, String [] coins){
        System.out.print("\033[2J\033[1;1H");
        System.out.println("Enter in the number that the coin you want to see the average price of is next to");
        printCoins(coins);
        int coin = console.nextInt();

        System.out.print("\033[2J\033[1;1H");
        System.out.println("Enter the number that is next to the first month\n");
        printMonths(months);
        int startingMonth = console.nextInt();

        System.out.print("\033[2J\033[1;1H");
        System.out.println("Enter the number that is next to the second month\n");
        printMonths(months);
        int finalMonth = console.nextInt();
        
            
        System.out.print("\033[2J\033[1;1H");
        String percent = String.format("%.2f", 100*((arr1[coin][finalMonth]-arr1[coin][startingMonth])/arr1[coin][startingMonth]));
        System.out.println("The percent change from "+months[startingMonth]+" to "+months[finalMonth]+" is "+percent+"%");
        System.out.println("Type in \"Done\" to go back to the main screen");
    }
    

    public static void average(double [][] arr1, String [] coins, Scanner console) {
        System.out.print("\033[2J\033[1;1H");
        System.out.println("Which coin do you want to see the average price of?");
        printCoins(coins);
        int coin = console.nextInt();
        int sum = 0;
        for(int i = 0; i< arr1.length; i++){
            sum+=arr1[coin][i];
        }
        System.out.println("The average price of "+coins[coin]+" over 10 months was $"+sum/10);
        System.out.println("Type in \"Done\" to go back to the main screen");
    }


    public static void profit(double [][] arr1, String[] coins, Scanner console){
        System.out.print("\033[2J\033[1;1H");
        System.out.println("How much money do you want to put in to start?");
        int money = console.nextInt();
        System.out.println("Enter in the number that the coin you want to buy is next to");
        printCoins(coins);
        int coin = console.nextInt();

        
        System.out.println("If you bought $"+money+" worth of "+coins[coin]+", your money would be worth $"+String.format("%.2f",(money/arr1[coin][0])*arr1[coin][9])+"\nYou would have profited $"+String.format("%.2f",((money/arr1[coin][0])*arr1[coin][9])-money));
    }

    public static void worstMonth(double [][] arr1, String[] coins, String[] months, Scanner console) {
        System.out.print("\033[2J\033[1;1H");
        System.out.println("Enter the number next to the coin that you want to see the worst month it was to buy");
        printCoins(coins);
        int coin = console.nextInt();

        double worstPrice = 0;
        int worstMonth = 0;
        System.out.print("\033[2J\033[1;1H");
        for(int i = 0; i < arr1[coin].length; i++){
            if(arr1[coin][i] > worstPrice){
                worstPrice = arr1[coin][i];
                worstMonth = i;
            }
        }
        System.out.println("The worst month to buy "+coins[coin]+" was "+months[worstMonth]+" at a price of $"+worstPrice);

    }

    public static void bestMonth(double [][] arr1, String[] coins, String[] months, Scanner console) {
        System.out.print("\033[2J\033[1;1H");
        System.out.println("Enter the number next to the coin that you want to see the best month it was to buy");
        printCoins(coins);
        int coin = console.nextInt();

        double bestPrice = Integer.MAX_VALUE;
        int bestMonth = 0;
        System.out.print("\033[2J\033[1;1H");
        for(int i = 0; i < arr1[coin].length; i++){
            if(arr1[coin][i] < bestPrice){
                bestPrice = arr1[coin][i];
                bestMonth = i;
            }
        }
        System.out.println("The best month to buy "+coins[coin]+" was "+months[bestMonth]+" at a price of $"+bestPrice);

    }

    public static void funFacts(String[] coins, Scanner console) {
        System.out.print("\033[2J\033[1;1H");
        System.out.println("Enter the number next to the coin that you want to learn about");
        printCoins(coins);
        int coin = console.nextInt();

        System.out.print("\033[2J\033[1;1H");
        String [] facts = {"Bitcoin was created in 2009 by an unknown person/group with the alias, Satoshi Nakamoto. It was the first crypto currency.", "Ethereum is a decentralized open-source blockchain system, that other crpytocurrencies can use as a platform for the basis of their token","Binance coin is an essential part for the functioning of one of the biggest crypto exchanges in the world, Binance.", "Solana is a highly functional open source project that banks on blockchain technology’s permissionless nature to provide decentralized finance (DeFi) solutions.", "Cardano is a proof-of-stake blockchain platform that says its goal is to allow “changemakers, innovators and visionaries” to bring about positive global change.", "XRP was created by Ripple to be a speedy, less costly and more scalable alternative to both other digital assets and existing monetary payment platforms","Polkadot is an open-source sharding multichain protocol that facilitates the cross-chain transfer of any data or asset types, not just tokens, thereby making a wide range of blockchains interoperable with each other.", "Dogecoin (DOGE) is based on the popular \"doge\" Internet meme and features a Shiba Inu on its logo. Tesla CEO Elon Musk posted several tweets to millions of followers that Dogecoin is his favorite coin, boosting the price significantly","Shiba Inu coin was created anonymously in August 2020 under the pseudonym “Ryoshi.” The meme coin quickly gained speed and value as a community of investors was drawn in by the cute charm of the coin paired with headlines and Tweets from personalities like Elon Musk and Vitalik Buterin.","Litecoin (LTC) is a cryptocurrency that was designed to provide fast, secure and low-cost payments by leveraging the unique properties of blockchain technology"};
        System.out.println(facts[coin]);
    }
    //{"BTC","ETH", "BNB", "SOL","ADA","XRP","DOT","DOGE","SHIB","LTC"};
    public static void printCoins(String[] coins) {
        for(int i = 0; i < coins.length; i++){
            System.out.println(i+". "+coins[i]);
        }
        
    }

    public static void printMonths(String[] months) {
        for(int i = 0; i < months.length; i++){
            System.out.println(i+". "+months[i]);
        }
        
    }
}