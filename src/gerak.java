package pacman;

public class gerak {

    private int p = 4, q = 4, a = 0, b = 0, c = 0;
    private int f = p - 1, t = q - 1;
    private int poin=0;

    public int getPoin() {
        if(a>0||b>0||c>0){
            poin=1;}
        if(b>0&&a>0||b>0&&c>0||a>0&&c>0){
            poin=2;}
        if(a>0&&b>0&&c>0){
            poin=3;
        }
        return poin;
    }
    String[][] map = new String[10][10];

    public void kiri() {
        q = q - 1;
        if (p == 0 || p == 9 || q == 0 || q == 9 || p == 2 && (q == 5 || q == 6 || q == 7 || q == 8) || p == 5 && (q == 1 || q == 5) || p == 6 && (q == 5 || q == 6 || q == 7 || q == 8) || p == 7 && q == 7 || p == 8 && (q == 4 || q == 5) || p == 8 && (q == 4 || q == 5)) {
            q = q + 1;
        }
    }
    public void kanan() {
        this.q = q + 1;
        if (p == 0 || p == 9 || q == 0 || q == 9 || p == 2 && (q == 5 || q == 6 || q == 7 || q == 8) || p == 5 && (q == 1 || q == 5) || p == 6 && (q == 5 || q == 6 || q == 7 || q == 8) || p == 7 && q == 7 || p == 8 && (q == 4 || q == 5) || p == 8 && (q == 4 || q == 5)) {
            q = q - 1;
        }
    }
    public void atas() {
        this.p = p - 1;
        if (p == 0 || p == 9 || q == 0 || q == 9 || p == 2 && (q == 5 || q == 6 || q == 7 || q == 8) || p == 5 && (q == 1 || q == 5) || p == 6 && (q == 5 || q == 6 || q == 7 || q == 8) || p == 7 && q == 7 || p == 8 && (q == 4 || q == 5) || p == 8 && (q == 4 || q == 5)) {
            p = p + 1;
        }
    }
    public void bawah() {
        this.p = p + 1;
        if (p == 0 || p == 9 || q == 0 || q == 9 || p == 2 && (q == 5 || q == 6 || q == 7 || q == 8) || p == 5 && (q == 1 || q == 5) || p == 6 && (q == 5 || q == 6 || q == 7 || q == 8) || p == 7 && q == 7 || p == 8 && (q == 4 || q == 5) || p == 8 && (q == 4 || q == 5)) {
            p = p - 1;
        }
    }
    public void tampil() {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                if (i == 0 || i == 9 || j == 0 || j == 9 || i == 2 && (j == 5 || j == 6 || j == 7 || j == 8) || i == 5 && (j == 1 || j == 5) || i == 6 && (j == 5 || j == 6 || j == 7 || j == 8) || i == 7 && j == 7 || i == 8 && (j == 4 || j == 5) || i == 8 && (j == 4 || j == 5)) {
                    map[i][j] = "#";
                } else if (i == 3 && j == 4 || i == 5 && j == 2 || i == 6 && j == 4) {
                    map[i][j] = "*";
                } else {
                    map[i][j] = " ";
                }
                if (i == p && j == q) {
                    map[i][j] = "@";
                }
                if (p == 3 && q == 4) {
                    a = 1;
                } else if (a > 0) {
                    map[3][4] = " ";
                }
                if (p == 5 && q == 2) {
                    b = 1;
                } else if (b > 0) {
                    map[5][2] = " ";
                }
                if (p == 6 && q == 4) {
                    c = 1;
                } else if (c > 0) {
                    map[6][4] = " ";
                }
                System.out.print(map[i][j]);
            }
            System.out.println("");
            if (a > 0 && b > 0 && c > 0) {
                System.out.println("You win!!! (*o*)");
                System.exit(0);
            }
        }
    }
}