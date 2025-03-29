import java.util.*;

public class MyArrayList<T> implements List<T> {

	private int size;
	private int capacity = 100;
	private Object[] array;

	public MyArrayList() {
		size = 0;
		array = new Object[capacity];
	}

	@Override
	public List<T> subList(int a, int b) {
		// ToDo: implement
		return null;
	}
	
	@Override
	public ListIterator<T> listIterator(int x) {
		return null;
	}

	@Override
	public ListIterator<T> listIterator() {
		return null;
	}
	
	public int lastIndexOf(Object x) {
		return 0;
	}
	
	public boolean add(T e) {
		array[size] = e;
		size++;
		return true;
	}
	
	public void add(int index, T element) {
		
	}
	
	public boolean addAll(Collection<? extends T> c) {
		boolean f = false;
		for (T x : c) {
			f = f | add(c);
		}
		return f;
	}
	
	public boolean addAll(int index, Collection<? extends T> c) {
		return false;
	}
	
	public void clear() {
		size = 0;
	}
	
	public boolean contains(Object o) {
		return false;
	}
	
	public boolean containsAll(Collection<?> c) {
		return false;
	}
	
	public boolean equals(Object o) {
		return false;
	}
	
	public T get(int index) {
		return null;
	}
	public int hashCode() {
		return 0;
	}
	public int indexOf(Object o) {
		return 0;
	}
	public boolean isEmpty() {
		return false;
	}
	public Iterator<T> iterator() {
		return null;
	}
	
	public T remove(int index) {
		return null;
	}
	
	public boolean remove(Object o) {
		return false;
	}
	public boolean removeAll(Collection<?> c) {
		return false;
	}
	public boolean retainAll(Collection<?> c) {
		return false;
	}
	public T set(int index, T element) {
		return null;
	}
	public int size() {
		return size;
	}

	public Object[] toArray() {
		return null;
	}
	public <E> E[] toArray(E[] a) {
		return null;
	}
	
	public String toString() {
		String result = "";
		for (int i = 0; i < size; i++) {
			result += array[i].toString() + " | ";
		}
		return result.trim();
	}
	
	public static void main(String [] args) {
		MyArrayList<String> mal = new MyArrayList<>();
		System.out.println(mal.size());
		mal.add("Privet!");
		mal.add("Bon Jour!");
		mal.add("Hello!");
		System.out.println(mal.size());
		System.out.println(mal);
		
		mal.clear();
		System.out.println(mal.size());
		mal.add("Isenmesez!");
		System.out.println(mal);
		System.out.println(mal.size());
	}
	
}
