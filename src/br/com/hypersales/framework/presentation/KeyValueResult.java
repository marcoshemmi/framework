package br.com.hypersales.framework.presentation;

public class KeyValueResult<K,V> {
	private K key;
	private V value;
	
	public KeyValueResult() {
		super();
	}

	public KeyValueResult(K k, V v) {
		super();
		this.key = k;
		this.value = v;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
	

}
