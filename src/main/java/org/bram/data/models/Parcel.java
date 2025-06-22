package org.bram.data.models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection="Parcel")
public class Parcel {
}
