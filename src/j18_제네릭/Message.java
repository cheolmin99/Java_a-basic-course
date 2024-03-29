package j18_제네릭;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Message<T, V> {
	private T code;
	private V data;
	
}
