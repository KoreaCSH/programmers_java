package Lv2;

import java.util.LinkedList;
import java.util.Queue;

public class 게임최단거리 {

    static int N;
    static int M;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[][] direction;
    static boolean[][] isVisited;

    public int solution(int[][] maps) {

        N = maps[0].length;
        M = maps.length;
        direction = new int[M][N];
        isVisited = new boolean[M][N];

        bfs(maps);

        return direction[M-1][N-1] == 0 ? -1 : direction[M-1][N-1] + 1;
    }

    public static void bfs(int[][] maps) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {0, 0});
        isVisited[0][0] = true;

        while (!q.isEmpty()) {
            int[] now = q.poll();
            int cx = now[0];
            int cy = now[1];

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if (nx >= 0 && nx < M && ny >= 0 && ny < N && maps[nx][ny] == 1) {
                    if (!isVisited[nx][ny]) {
                        isVisited[nx][ny] = true;
                        direction[nx][ny] = direction[cx][cy] + 1;
                        q.add(new int[] {nx, ny});
                    }
                }
            }

        }
    }

}
