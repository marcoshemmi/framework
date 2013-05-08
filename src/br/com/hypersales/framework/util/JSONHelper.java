package br.com.hypersales.framework.util;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONHelper<T> {
	public T FromJSONToObject(String jsonSource, Class<T> ref) throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper mapper = new ObjectMapper();
		T result =  mapper.readValue(jsonSource, ref);
		return result;
	}
}
