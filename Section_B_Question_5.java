import java.util.LinkedList;

public class Section_B_Question_5 {

	private static class Cell {

		int x;

		int y;

		int dist; // distance

		Cell prev; // parent cell in the path

		Cell(int x, int y, int dist, Cell prev) {

			this.x = x;

			this.y = y;

			this.dist = dist;

			this.prev = prev;

		}

	}

	public static void shortestPath(char[][] matrix) {

		int sx = 0, sy = 0, dx = 0, dy = 0;

		// initialize the cells

		int m = matrix.length;

		int n = matrix[0].length;

		Cell[][] cells = new Cell[m][n];

		for (int i = 0; i < m; i++) {

			for (int j = 0; j < n; j++) {

				if (matrix[i][j] == 'A') {

					sx = i;

					sy = j;

				}

				if (matrix[i][j] == 'G') {

					dx = i;

					dy = j;

				}

				cells[i][j] = new Cell(i, j, Integer.MAX_VALUE, null);

			}

		}

		LinkedList<Cell> queue = new LinkedList<>();

		Cell src = cells[sx][sy];

		src.dist = 0;

		queue.add(src);

		Cell dest = null;

		Cell p;

		while ((p = queue.poll()) != null) {

			// find destination

			if (p.x == dx && p.y == dy) {

				dest = p;

				break;

			}

			// moving up

			visit(cells, queue, p.x - 1, p.y, p, matrix);

			// moving down

			visit(cells, queue, p.x + 1, p.y, p, matrix);

			// moving left

			visit(cells, queue, p.x, p.y - 1, p, matrix);

			// moving right

			visit(cells, queue, p.x, p.y + 1, p, matrix);

		}

		if (dest == null)

			System.out.println("No possible solution");

		else

			System.out.println("Minimum number of steps: " + dest.dist);

	}

	private static void visit(Cell[][] cells, LinkedList<Cell> queue, int x, int y, Cell parent, char[][] matrix) {

		if (x < 0 || x >= cells.length || y < 0 || y >= cells[0].length || cells[x][y] == null

				|| matrix[x][y] == 'P') {

			return;

		}

		// update distance, and previous node

		int dist = parent.dist + 1;

		Cell p = cells[x][y];

		if (dist < p.dist) {

			p.dist = dist;

			p.prev = parent;

			queue.add(p);

		}

	}

	public static void main(String[] args) {

		char[][] matrix = {

				{ '0', '0', '0', '0' },

				{ 'P', '0', 'G', '0' },

				{ '0', '0', '0', '0' },

				{ 'A', '0', 'P', '0' },

				{ '0', '0', '0', '0' } };

		System.out.println("Output 1:");

		shortestPath(matrix);

		char[][] matrix1 = {

				{ '0', '0', '0', '0' },

				{ 'P', '0', 'G', '0' },

				{ 'P', 'P', '0', '0' },

				{ 'A', 'P', 'P', '0' },

				{ 'P', '0', '0', '0' } };

		System.out.println("Output 2:");

		shortestPath(matrix1);

	}

}