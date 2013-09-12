package br.com.caelum.vraptor4.serialization.gson.adapters;

import java.lang.reflect.Type;
import java.util.Calendar;

import javax.xml.bind.DatatypeConverter;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

/**
 * Deserialize {@link Calendar} using ISO8601 format.
 * 
 * @author Otávio Garcia
 */
public class CalendarDeserializer implements JsonDeserializer<Calendar> {

	@Override
	public Calendar deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
		return DatatypeConverter.parseDate(json.getAsString());
	}
}