package rehabilitation.device.model.dto;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PressureResponse {
	private Integer thumb;
	private Integer indexFinger;
	private Integer middleFinger;
	private Integer ringFinger;
	private Integer littleFinger;
	private LocalDateTime date;

	@Builder
	public PressureResponse(Integer thumb, Integer indexFinger, Integer middleFinger, Integer ringFinger, Integer littleFinger, LocalDateTime date) {
		this.thumb = thumb;
		this.indexFinger = indexFinger;
		this.middleFinger = middleFinger;
		this.ringFinger = ringFinger;
		this.littleFinger = littleFinger;
		this.date = date;
	}
}
