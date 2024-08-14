package telran.java53.service;

public class TestServiceImpl implements TestService {

	@Override
	public Object create(Object object) {
		return new Object();
	}

	@Override
	public Object read() {
<<<<<<< HEAD
		System.out.println("print 1");
		System.out.println("print 2");
		System.out.println("print 3");
=======
		for(int i = 0; i < 10; i++) {
			System.out.println("Numner " + i);
		}
>>>>>>> 535e0ea776a923c17bfb756e24d9482a833417a1
		return null;
	}

	@Override
	public boolean update(Object object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
