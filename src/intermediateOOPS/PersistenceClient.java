package intermediateOOPS;

abstract class Persistence {
	public abstract void persist();
}

class FilePersistence extends Persistence {

	@Override
	public void persist() {
		System.out.println("Data is been saved in file.");
	}
}

class DatabasePersistence extends Persistence {

	@Override
	public void persist() {
		System.out.println("Data is been saved in database.");
	}
}

public class PersistenceClient {

	public static Persistence getPersistenceObject() {
		boolean saveToFile = true;

		if (saveToFile) {
			return new FilePersistence();
		} else {
			return new DatabasePersistence();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persistence persistence = getPersistenceObject();
		persistence.persist();
	}
}
