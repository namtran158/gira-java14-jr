package cybersoft.javabackend.girajava14jr.common.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@MappedSuperclass
public class BaseEntity {
	
	@Id
	@GeneratedValue
	protected Long id;
	
	@Version
	protected int version;
	
	@CreatedBy
	@Column(name = "created_by")
	protected String createdBy;
	
	@CreatedDate
	@Column(name = "created_at")
	protected LocalDateTime createdAt;
	
	@LastModifiedBy
	@Column(name = "updated_by")
	protected String updatedBy;
	
	@LastModifiedDate
	@Column(name = "updated_at")
	protected LocalDateTime updatedAt;
}
