package graph;

import java.util.LinkedList;
import java.util.Queue;

public class Maze {
    public int solution(int[][] maze) {
        //bfs로직을 활용하는데
        //다음에 접근할 수있는 칸을 maze의 가로 세로 크기 이내의 인접한 칸
        //을 기준으로 판단
        //int[]를 담는 Queue, {x,y, 여태까지 이동거리}
        Queue<int[]> visitNext = new LinkedList<>();
        //미로에서 이미 도달한 적 있는 칸임을 나타내기 위한 visited 이차원 배열
        boolean[][] visited = new boolean[6][6];
        visitNext.offer(new int[]{5, 0, 0});
        int answer = -1;
        //bfs시작
        // queue 가 비어있찌 않은 동안
        while (!visitNext.isEmpty()) {
            //다음에 갈 곳을 queue에서 꺼낸다
            int[] next = visitNext.poll();
            int nowX = next[0];
            int nowY = next[1];
            int steps = next[2];
            visited[nowX][nowY]=true;

            // 4개의 방향을 확인한다.
            // 위
            int[] top = new int[]{nowX - 1, nowY, steps + 1};
            //1. 미로의 범위를 벗어나진 않는지.
            //2. top[0], top[1]이 -1보다는 크고,ㅏ 6보다는 작아야한다.
            //3. 미로에서 진행 가능한 칸인지 (0또는 3)
            //3. 아직 방문한적 없는지


        }
        return answer;

    }

    //미로에

    public st에tic void main(String[] args) {
        new Maze().solution(new int[][]{
                {0, 0, 0, 0, 0, 3},
                {1, 0, 1, 1, 1, 0},
                {1, 0, 0, 0, 1, 0},
                {1, 0, 1, 0, 1, 0},
                {0, 0, 1, 0, 0, 0},
                {2, 1, 1, 0, 1, 1}
        });

    }
}
