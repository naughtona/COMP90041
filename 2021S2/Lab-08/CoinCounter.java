import java.io.File;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CoinCounter {
    
    private final static char COIN = 'O';
    private String filename;

    public CoinCounter(String filename) {
        this.filename = filename;
    }

    public int readCoinFile() {
        int nCoins = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String nextLine = br.readLine();
            while (nextLine != null) {
                nCoins += countCoins(nextLine);
                nextLine = br.readLine();
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("Input Coin File could not be found. Terminating.");
            System.exit(1);
        } catch (IOException ioe) {
            System.out.println("File IO Exception raised while reading. Terminating.");
            System.exit(1);
        } catch (InvalidCoinFileException icfe) {
            System.out.println(icfe.getMessage() + " Terminating.");
            System.exit(1);
        }

        return nCoins;
    }

    public void writeCoinFile(int nCoins) {
        try (PrintWriter pw = new PrintWriter(new File("count.txt"))) {
            pw.println("You have " + nCoins + " coins!");
        } catch (FileNotFoundException fnfe) {
            System.out.println("Output Coin File could not be found. Terminating.");
            System.exit(1);
        }
    }

    private int countCoins(String line) throws InvalidCoinFileException {
        for (char c : line.toCharArray())
            if (c != COIN)
                throw new InvalidCoinFileException();
        
        return line.length();
    }

    public static void main(String[] args) {
        String filename = args[0];
        CoinCounter cc = new CoinCounter(filename);
        int nCoins = cc.readCoinFile();
        cc.writeCoinFile(nCoins);
    }

}

