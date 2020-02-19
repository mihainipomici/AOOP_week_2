package week2;

class Piece extends Chess.Rook {
	public Piece(Chess.Player p2) {
		super(p2);
	}

	public Piece() {
		super();
	}

	// ...

	/**
	 * This method does not have to check the validity of the position
	 */
	public void setArbitraryPosition(Position currentPosition) {
		// ...
	}

	/**
	 * This method checks if the position is a valid position
	 */
	public boolean isValidPosition(Position newPosition) {
		// ...
		return false;
	}
	
	/**
	 * This method moves the piece
	 * @return true if the piece has been moved correctly, false otherwise
	 */
	public boolean move(Position newPosition) {
		// ...
		return false;
	}

	public void setArbitraryPosition(Chess.Position f) {
	}

	private class Position {
	}
}


// ...
// write here all missing classes
// ...


public class Chess {
	
	public static void main(String[] args) {
		Player p1 = new Player("White player");
		p1.setColorWhite(true);
		Player p2 = new Player("Black player");
		p2.setColorWhite(false);
		
		System.out.println("Testing kings:");
		Piece whiteKing = new King(p1);
		whiteKing.setArbitraryPosition(new Position('f', 5));
		test(whiteKing, 'a', 1, false);
		test(whiteKing, 'f', 4, true);
		
		System.out.println("Testing rooks:");
		Rook blackRook = new Rook(p2);
		blackRook.setArbitraryPosition('d', 5);
		test(blackRook, 'h', 5, true);
		test(blackRook, 'h', 1, false);
		test(blackRook, 'd', 9, false);
		
		System.out.println("Testing bishops:");
		Piece whiteBishop = new Bishop(p1);
		whiteBishop.setArbitraryPosition(new Position('d', 5));
		test(whiteBishop, 'b', 2, false);
		test(whiteBishop, 'a', 8, true);
		
		System.out.println("Testing knights:");
		Knight blackKnight = new Knight(p2);
		blackKnight.setArbitraryPosition('d', 4);
		test(blackKnight, 'e', 6, true);
		test(blackKnight, 'f', 6, false);
		test(blackKnight, 'c', 2, true);
		test(blackKnight, 'i', 8, false);
		
		System.out.println("Testing pawns:");
		Pawn whitePawn = new Pawn(p1);
		Pawn blackPawn = new Pawn(p2);
		blackPawn.setArbitraryPosition('b', 4);
		test(blackPawn, 'b', 3, true);
		test(blackPawn, 'b', 5, false);
		whitePawn.setArbitraryPosition('f', 2);
		test(whitePawn, 'f', 3, true);
		test(whitePawn, 'f', 4, true);
		blackPawn.setArbitraryPosition('g', 5);
		test(blackPawn, 'g', 4, true);
		test(blackPawn, 'g', 3, false);
		whitePawn.setArbitraryPosition('e', 7);
		test(whitePawn, 'd', 8, false);
		test(whitePawn, 'f', 8, false);
	}
	
	public static void test(Pawn p, char x, int y, boolean valid) {
		if (p.isValidPosition(new Position(x, y)) == valid) {
			System.out.println("  > Test passed!");
		} else {
			System.out.println("  X Test NOT passed!");
		}
	}

	static class Player {
		private boolean colorWhite;

		public Player(String white_player) {
		}

		public void setColorWhite(boolean colorWhite) {
			this.colorWhite = colorWhite;
		}
	}
	private static class King extends Piece {

		public King(Player p1) {
			super();
		}
	}

	static class Position {
		public Position(char f, int i) {
		}
	}

	public static class Rook extends Knight {
		public Rook(Player p2) {
			this();

		}

		public Rook() {
			super();


		}

		public void setArbitraryPosition(char d, int i) {
		}
	}

	private static class Bishop extends Piece {
		public Bishop(Player p1) {
			super();
		}
	}

	private static class Knight extends Pawn {
		public Knight(Player p2) {
			this();
		}

		public Knight() {
			super();

		}

		public void setArbitraryPosition(char d, int i) {
		}

		public boolean isValidPosition(Position position) {
			return true;
		}
	}

	private static class Pawn {
		public Pawn(Player p1) {
		}

		public Pawn() {

		}

		public void setArbitraryPosition(char b, int i) {
		}

		public boolean isValidPosition(Position position) {
			return true;
		}
	}
}
