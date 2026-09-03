public class Enemy{
	Move[] Moves;
	//String[] Affinities;
	int id;

	public Enemy(Move[] Moves, String[] Affinities, int id){
		this.Moves = Moves;
		//this.Affinities = Affinities;
		this.id = id;
	}

    public void GenerateEnemy(){
        for(Move thing : this.Moves){
            thing = new Move(1.0,1);
        }
        this.id = 1; 
    }
}