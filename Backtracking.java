import java.util.ArrayList;

public class Backtracking {
    public static void main(String[] args) {
        System.out.println(path(3, 3));

        direction("", 3, 3);

        System.out.println(directionRet("", 3, 3));

        System.out.println(pathRetDiagonal("", 3, 3));

        boolean[][] board = {
                { true, true, true },
                { true, true, true },
                { true, true, true },
        };

        // pathRestriction("", board, 0, 0);

        // System.out.println(pathArrayList("", board, 0, 0));

        allPath("", board, 0, 0);
    }

    static int path(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }

        int right = path(r, c - 1);
        int down = path(r - 1, c);

        return right + down;
    }

    static void direction(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1) {
            direction(p + 'D', r - 1, c);
        }
        if (c > 1) {
            direction(p + 'R', r, c - 1);
        }
    }

    static ArrayList<String> directionRet(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if (r > 1) {
            ans.addAll(directionRet(p + 'D', r - 1, c));
        }
        if (c > 1) {
            ans.addAll(directionRet(p + 'R', r, c - 1));
        }
        return ans;
    }

    static ArrayList<String> pathRetDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if (r > 1 && c > 1) {
            ans.addAll(pathRetDiagonal(p + 'D', r - 1, c - 1));
        }
        if (r > 1) {
            ans.addAll(pathRetDiagonal(p + 'V', r - 1, c));
        }
        if (c > 1) {
            ans.addAll(pathRetDiagonal(p + 'H', r, c - 1));
        }
        return ans;
    }

    // Obstacle maze (2D matrix) problem.

    static void pathRestriction(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        if (r < maze.length - 1) {
            pathRestriction(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            pathRestriction(p + 'R', maze, r, c + 1);
        }
    }

    static ArrayList<String> pathArrayList(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if (!maze[r][c]) {
            return ans;
        }
        if (r < maze.length - 1) {
            ans.addAll(pathArrayList(p + 'D', maze, r + 1, c));
        }
        if (c < maze[0].length - 1) {
            ans.addAll(pathArrayList(p + 'R', maze, r, c + 1));
        }
        return ans;
    }

    static void allPath(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }
        // i am considering this in my path.
        maze[r][c] = false;

        if (r < maze.length - 1) {
            allPath(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            allPath(p + 'R', maze, r, c + 1);
        }
        if (r > 0) {
            allPath(p + 'U', maze, r - 1, c);
        }
        if (c > 0) {
            allPath(p + 'L', maze, r, c - 1);
        }
        // this line is where the function will be over.
        // so before the function gets removed, also remove the changes that were made
        // by that function.
        maze[r][c] = true;
    }
}