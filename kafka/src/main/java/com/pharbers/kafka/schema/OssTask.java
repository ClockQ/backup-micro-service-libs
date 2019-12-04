/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.pharbers.kafka.schema;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class OssTask extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 6805112854718453974L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"OssTask\",\"namespace\":\"com.pharbers.kafka.schema\",\"fields\":[{\"name\":\"assetId\",\"type\":\"string\"},{\"name\":\"jobId\",\"type\":\"string\"},{\"name\":\"traceId\",\"type\":\"string\"},{\"name\":\"ossKey\",\"type\":\"string\"},{\"name\":\"titleIndex\",\"type\":{\"type\":\"array\",\"items\":\"int\"}},{\"name\":\"fileType\",\"type\":\"string\"},{\"name\":\"fileName\",\"type\":\"string\"},{\"name\":\"sheetName\",\"type\":\"string\"},{\"name\":\"labels\",\"type\":{\"type\":\"array\",\"items\":\"string\"}},{\"name\":\"dataCover\",\"type\":{\"type\":\"array\",\"items\":\"string\"}},{\"name\":\"geoCover\",\"type\":{\"type\":\"array\",\"items\":\"string\"}},{\"name\":\"markets\",\"type\":{\"type\":\"array\",\"items\":\"string\"}},{\"name\":\"molecules\",\"type\":{\"type\":\"array\",\"items\":\"string\"}},{\"name\":\"providers\",\"type\":{\"type\":\"array\",\"items\":\"string\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence assetId;
  @Deprecated public java.lang.CharSequence jobId;
  @Deprecated public java.lang.CharSequence traceId;
  @Deprecated public java.lang.CharSequence ossKey;
  @Deprecated public java.util.List<java.lang.Integer> titleIndex;
  @Deprecated public java.lang.CharSequence fileType;
  @Deprecated public java.lang.CharSequence fileName;
  @Deprecated public java.lang.CharSequence sheetName;
  @Deprecated public java.util.List<java.lang.CharSequence> labels;
  @Deprecated public java.util.List<java.lang.CharSequence> dataCover;
  @Deprecated public java.util.List<java.lang.CharSequence> geoCover;
  @Deprecated public java.util.List<java.lang.CharSequence> markets;
  @Deprecated public java.util.List<java.lang.CharSequence> molecules;
  @Deprecated public java.util.List<java.lang.CharSequence> providers;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public OssTask() {}

  /**
   * All-args constructor.
   * @param assetId The new value for assetId
   * @param jobId The new value for jobId
   * @param traceId The new value for traceId
   * @param ossKey The new value for ossKey
   * @param titleIndex The new value for titleIndex
   * @param fileType The new value for fileType
   * @param fileName The new value for fileName
   * @param sheetName The new value for sheetName
   * @param labels The new value for labels
   * @param dataCover The new value for dataCover
   * @param geoCover The new value for geoCover
   * @param markets The new value for markets
   * @param molecules The new value for molecules
   * @param providers The new value for providers
   */
  public OssTask(java.lang.CharSequence assetId, java.lang.CharSequence jobId, java.lang.CharSequence traceId, java.lang.CharSequence ossKey, java.util.List<java.lang.Integer> titleIndex, java.lang.CharSequence fileType, java.lang.CharSequence fileName, java.lang.CharSequence sheetName, java.util.List<java.lang.CharSequence> labels, java.util.List<java.lang.CharSequence> dataCover, java.util.List<java.lang.CharSequence> geoCover, java.util.List<java.lang.CharSequence> markets, java.util.List<java.lang.CharSequence> molecules, java.util.List<java.lang.CharSequence> providers) {
    this.assetId = assetId;
    this.jobId = jobId;
    this.traceId = traceId;
    this.ossKey = ossKey;
    this.titleIndex = titleIndex;
    this.fileType = fileType;
    this.fileName = fileName;
    this.sheetName = sheetName;
    this.labels = labels;
    this.dataCover = dataCover;
    this.geoCover = geoCover;
    this.markets = markets;
    this.molecules = molecules;
    this.providers = providers;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return assetId;
    case 1: return jobId;
    case 2: return traceId;
    case 3: return ossKey;
    case 4: return titleIndex;
    case 5: return fileType;
    case 6: return fileName;
    case 7: return sheetName;
    case 8: return labels;
    case 9: return dataCover;
    case 10: return geoCover;
    case 11: return markets;
    case 12: return molecules;
    case 13: return providers;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: assetId = (java.lang.CharSequence)value$; break;
    case 1: jobId = (java.lang.CharSequence)value$; break;
    case 2: traceId = (java.lang.CharSequence)value$; break;
    case 3: ossKey = (java.lang.CharSequence)value$; break;
    case 4: titleIndex = (java.util.List<java.lang.Integer>)value$; break;
    case 5: fileType = (java.lang.CharSequence)value$; break;
    case 6: fileName = (java.lang.CharSequence)value$; break;
    case 7: sheetName = (java.lang.CharSequence)value$; break;
    case 8: labels = (java.util.List<java.lang.CharSequence>)value$; break;
    case 9: dataCover = (java.util.List<java.lang.CharSequence>)value$; break;
    case 10: geoCover = (java.util.List<java.lang.CharSequence>)value$; break;
    case 11: markets = (java.util.List<java.lang.CharSequence>)value$; break;
    case 12: molecules = (java.util.List<java.lang.CharSequence>)value$; break;
    case 13: providers = (java.util.List<java.lang.CharSequence>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'assetId' field.
   * @return The value of the 'assetId' field.
   */
  public java.lang.CharSequence getAssetId() {
    return assetId;
  }

  /**
   * Sets the value of the 'assetId' field.
   * @param value the value to set.
   */
  public void setAssetId(java.lang.CharSequence value) {
    this.assetId = value;
  }

  /**
   * Gets the value of the 'jobId' field.
   * @return The value of the 'jobId' field.
   */
  public java.lang.CharSequence getJobId() {
    return jobId;
  }

  /**
   * Sets the value of the 'jobId' field.
   * @param value the value to set.
   */
  public void setJobId(java.lang.CharSequence value) {
    this.jobId = value;
  }

  /**
   * Gets the value of the 'traceId' field.
   * @return The value of the 'traceId' field.
   */
  public java.lang.CharSequence getTraceId() {
    return traceId;
  }

  /**
   * Sets the value of the 'traceId' field.
   * @param value the value to set.
   */
  public void setTraceId(java.lang.CharSequence value) {
    this.traceId = value;
  }

  /**
   * Gets the value of the 'ossKey' field.
   * @return The value of the 'ossKey' field.
   */
  public java.lang.CharSequence getOssKey() {
    return ossKey;
  }

  /**
   * Sets the value of the 'ossKey' field.
   * @param value the value to set.
   */
  public void setOssKey(java.lang.CharSequence value) {
    this.ossKey = value;
  }

  /**
   * Gets the value of the 'titleIndex' field.
   * @return The value of the 'titleIndex' field.
   */
  public java.util.List<java.lang.Integer> getTitleIndex() {
    return titleIndex;
  }

  /**
   * Sets the value of the 'titleIndex' field.
   * @param value the value to set.
   */
  public void setTitleIndex(java.util.List<java.lang.Integer> value) {
    this.titleIndex = value;
  }

  /**
   * Gets the value of the 'fileType' field.
   * @return The value of the 'fileType' field.
   */
  public java.lang.CharSequence getFileType() {
    return fileType;
  }

  /**
   * Sets the value of the 'fileType' field.
   * @param value the value to set.
   */
  public void setFileType(java.lang.CharSequence value) {
    this.fileType = value;
  }

  /**
   * Gets the value of the 'fileName' field.
   * @return The value of the 'fileName' field.
   */
  public java.lang.CharSequence getFileName() {
    return fileName;
  }

  /**
   * Sets the value of the 'fileName' field.
   * @param value the value to set.
   */
  public void setFileName(java.lang.CharSequence value) {
    this.fileName = value;
  }

  /**
   * Gets the value of the 'sheetName' field.
   * @return The value of the 'sheetName' field.
   */
  public java.lang.CharSequence getSheetName() {
    return sheetName;
  }

  /**
   * Sets the value of the 'sheetName' field.
   * @param value the value to set.
   */
  public void setSheetName(java.lang.CharSequence value) {
    this.sheetName = value;
  }

  /**
   * Gets the value of the 'labels' field.
   * @return The value of the 'labels' field.
   */
  public java.util.List<java.lang.CharSequence> getLabels() {
    return labels;
  }

  /**
   * Sets the value of the 'labels' field.
   * @param value the value to set.
   */
  public void setLabels(java.util.List<java.lang.CharSequence> value) {
    this.labels = value;
  }

  /**
   * Gets the value of the 'dataCover' field.
   * @return The value of the 'dataCover' field.
   */
  public java.util.List<java.lang.CharSequence> getDataCover() {
    return dataCover;
  }

  /**
   * Sets the value of the 'dataCover' field.
   * @param value the value to set.
   */
  public void setDataCover(java.util.List<java.lang.CharSequence> value) {
    this.dataCover = value;
  }

  /**
   * Gets the value of the 'geoCover' field.
   * @return The value of the 'geoCover' field.
   */
  public java.util.List<java.lang.CharSequence> getGeoCover() {
    return geoCover;
  }

  /**
   * Sets the value of the 'geoCover' field.
   * @param value the value to set.
   */
  public void setGeoCover(java.util.List<java.lang.CharSequence> value) {
    this.geoCover = value;
  }

  /**
   * Gets the value of the 'markets' field.
   * @return The value of the 'markets' field.
   */
  public java.util.List<java.lang.CharSequence> getMarkets() {
    return markets;
  }

  /**
   * Sets the value of the 'markets' field.
   * @param value the value to set.
   */
  public void setMarkets(java.util.List<java.lang.CharSequence> value) {
    this.markets = value;
  }

  /**
   * Gets the value of the 'molecules' field.
   * @return The value of the 'molecules' field.
   */
  public java.util.List<java.lang.CharSequence> getMolecules() {
    return molecules;
  }

  /**
   * Sets the value of the 'molecules' field.
   * @param value the value to set.
   */
  public void setMolecules(java.util.List<java.lang.CharSequence> value) {
    this.molecules = value;
  }

  /**
   * Gets the value of the 'providers' field.
   * @return The value of the 'providers' field.
   */
  public java.util.List<java.lang.CharSequence> getProviders() {
    return providers;
  }

  /**
   * Sets the value of the 'providers' field.
   * @param value the value to set.
   */
  public void setProviders(java.util.List<java.lang.CharSequence> value) {
    this.providers = value;
  }

  /**
   * Creates a new OssTask RecordBuilder.
   * @return A new OssTask RecordBuilder
   */
  public static com.pharbers.kafka.schema.OssTask.Builder newBuilder() {
    return new com.pharbers.kafka.schema.OssTask.Builder();
  }

  /**
   * Creates a new OssTask RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new OssTask RecordBuilder
   */
  public static com.pharbers.kafka.schema.OssTask.Builder newBuilder(com.pharbers.kafka.schema.OssTask.Builder other) {
    return new com.pharbers.kafka.schema.OssTask.Builder(other);
  }

  /**
   * Creates a new OssTask RecordBuilder by copying an existing OssTask instance.
   * @param other The existing instance to copy.
   * @return A new OssTask RecordBuilder
   */
  public static com.pharbers.kafka.schema.OssTask.Builder newBuilder(com.pharbers.kafka.schema.OssTask other) {
    return new com.pharbers.kafka.schema.OssTask.Builder(other);
  }

  /**
   * RecordBuilder for OssTask instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<OssTask>
    implements org.apache.avro.data.RecordBuilder<OssTask> {

    private java.lang.CharSequence assetId;
    private java.lang.CharSequence jobId;
    private java.lang.CharSequence traceId;
    private java.lang.CharSequence ossKey;
    private java.util.List<java.lang.Integer> titleIndex;
    private java.lang.CharSequence fileType;
    private java.lang.CharSequence fileName;
    private java.lang.CharSequence sheetName;
    private java.util.List<java.lang.CharSequence> labels;
    private java.util.List<java.lang.CharSequence> dataCover;
    private java.util.List<java.lang.CharSequence> geoCover;
    private java.util.List<java.lang.CharSequence> markets;
    private java.util.List<java.lang.CharSequence> molecules;
    private java.util.List<java.lang.CharSequence> providers;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.pharbers.kafka.schema.OssTask.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.assetId)) {
        this.assetId = data().deepCopy(fields()[0].schema(), other.assetId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.jobId)) {
        this.jobId = data().deepCopy(fields()[1].schema(), other.jobId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.traceId)) {
        this.traceId = data().deepCopy(fields()[2].schema(), other.traceId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.ossKey)) {
        this.ossKey = data().deepCopy(fields()[3].schema(), other.ossKey);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.titleIndex)) {
        this.titleIndex = data().deepCopy(fields()[4].schema(), other.titleIndex);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.fileType)) {
        this.fileType = data().deepCopy(fields()[5].schema(), other.fileType);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.fileName)) {
        this.fileName = data().deepCopy(fields()[6].schema(), other.fileName);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.sheetName)) {
        this.sheetName = data().deepCopy(fields()[7].schema(), other.sheetName);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.labels)) {
        this.labels = data().deepCopy(fields()[8].schema(), other.labels);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.dataCover)) {
        this.dataCover = data().deepCopy(fields()[9].schema(), other.dataCover);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.geoCover)) {
        this.geoCover = data().deepCopy(fields()[10].schema(), other.geoCover);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.markets)) {
        this.markets = data().deepCopy(fields()[11].schema(), other.markets);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.molecules)) {
        this.molecules = data().deepCopy(fields()[12].schema(), other.molecules);
        fieldSetFlags()[12] = true;
      }
      if (isValidValue(fields()[13], other.providers)) {
        this.providers = data().deepCopy(fields()[13].schema(), other.providers);
        fieldSetFlags()[13] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing OssTask instance
     * @param other The existing instance to copy.
     */
    private Builder(com.pharbers.kafka.schema.OssTask other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.assetId)) {
        this.assetId = data().deepCopy(fields()[0].schema(), other.assetId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.jobId)) {
        this.jobId = data().deepCopy(fields()[1].schema(), other.jobId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.traceId)) {
        this.traceId = data().deepCopy(fields()[2].schema(), other.traceId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.ossKey)) {
        this.ossKey = data().deepCopy(fields()[3].schema(), other.ossKey);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.titleIndex)) {
        this.titleIndex = data().deepCopy(fields()[4].schema(), other.titleIndex);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.fileType)) {
        this.fileType = data().deepCopy(fields()[5].schema(), other.fileType);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.fileName)) {
        this.fileName = data().deepCopy(fields()[6].schema(), other.fileName);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.sheetName)) {
        this.sheetName = data().deepCopy(fields()[7].schema(), other.sheetName);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.labels)) {
        this.labels = data().deepCopy(fields()[8].schema(), other.labels);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.dataCover)) {
        this.dataCover = data().deepCopy(fields()[9].schema(), other.dataCover);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.geoCover)) {
        this.geoCover = data().deepCopy(fields()[10].schema(), other.geoCover);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.markets)) {
        this.markets = data().deepCopy(fields()[11].schema(), other.markets);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.molecules)) {
        this.molecules = data().deepCopy(fields()[12].schema(), other.molecules);
        fieldSetFlags()[12] = true;
      }
      if (isValidValue(fields()[13], other.providers)) {
        this.providers = data().deepCopy(fields()[13].schema(), other.providers);
        fieldSetFlags()[13] = true;
      }
    }

    /**
      * Gets the value of the 'assetId' field.
      * @return The value.
      */
    public java.lang.CharSequence getAssetId() {
      return assetId;
    }

    /**
      * Sets the value of the 'assetId' field.
      * @param value The value of 'assetId'.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.OssTask.Builder setAssetId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.assetId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'assetId' field has been set.
      * @return True if the 'assetId' field has been set, false otherwise.
      */
    public boolean hasAssetId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'assetId' field.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.OssTask.Builder clearAssetId() {
      assetId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'jobId' field.
      * @return The value.
      */
    public java.lang.CharSequence getJobId() {
      return jobId;
    }

    /**
      * Sets the value of the 'jobId' field.
      * @param value The value of 'jobId'.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.OssTask.Builder setJobId(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.jobId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'jobId' field has been set.
      * @return True if the 'jobId' field has been set, false otherwise.
      */
    public boolean hasJobId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'jobId' field.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.OssTask.Builder clearJobId() {
      jobId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'traceId' field.
      * @return The value.
      */
    public java.lang.CharSequence getTraceId() {
      return traceId;
    }

    /**
      * Sets the value of the 'traceId' field.
      * @param value The value of 'traceId'.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.OssTask.Builder setTraceId(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.traceId = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'traceId' field has been set.
      * @return True if the 'traceId' field has been set, false otherwise.
      */
    public boolean hasTraceId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'traceId' field.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.OssTask.Builder clearTraceId() {
      traceId = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'ossKey' field.
      * @return The value.
      */
    public java.lang.CharSequence getOssKey() {
      return ossKey;
    }

    /**
      * Sets the value of the 'ossKey' field.
      * @param value The value of 'ossKey'.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.OssTask.Builder setOssKey(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.ossKey = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'ossKey' field has been set.
      * @return True if the 'ossKey' field has been set, false otherwise.
      */
    public boolean hasOssKey() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'ossKey' field.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.OssTask.Builder clearOssKey() {
      ossKey = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'titleIndex' field.
      * @return The value.
      */
    public java.util.List<java.lang.Integer> getTitleIndex() {
      return titleIndex;
    }

    /**
      * Sets the value of the 'titleIndex' field.
      * @param value The value of 'titleIndex'.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.OssTask.Builder setTitleIndex(java.util.List<java.lang.Integer> value) {
      validate(fields()[4], value);
      this.titleIndex = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'titleIndex' field has been set.
      * @return True if the 'titleIndex' field has been set, false otherwise.
      */
    public boolean hasTitleIndex() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'titleIndex' field.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.OssTask.Builder clearTitleIndex() {
      titleIndex = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'fileType' field.
      * @return The value.
      */
    public java.lang.CharSequence getFileType() {
      return fileType;
    }

    /**
      * Sets the value of the 'fileType' field.
      * @param value The value of 'fileType'.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.OssTask.Builder setFileType(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.fileType = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'fileType' field has been set.
      * @return True if the 'fileType' field has been set, false otherwise.
      */
    public boolean hasFileType() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'fileType' field.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.OssTask.Builder clearFileType() {
      fileType = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'fileName' field.
      * @return The value.
      */
    public java.lang.CharSequence getFileName() {
      return fileName;
    }

    /**
      * Sets the value of the 'fileName' field.
      * @param value The value of 'fileName'.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.OssTask.Builder setFileName(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.fileName = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'fileName' field has been set.
      * @return True if the 'fileName' field has been set, false otherwise.
      */
    public boolean hasFileName() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'fileName' field.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.OssTask.Builder clearFileName() {
      fileName = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'sheetName' field.
      * @return The value.
      */
    public java.lang.CharSequence getSheetName() {
      return sheetName;
    }

    /**
      * Sets the value of the 'sheetName' field.
      * @param value The value of 'sheetName'.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.OssTask.Builder setSheetName(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.sheetName = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'sheetName' field has been set.
      * @return True if the 'sheetName' field has been set, false otherwise.
      */
    public boolean hasSheetName() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'sheetName' field.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.OssTask.Builder clearSheetName() {
      sheetName = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'labels' field.
      * @return The value.
      */
    public java.util.List<java.lang.CharSequence> getLabels() {
      return labels;
    }

    /**
      * Sets the value of the 'labels' field.
      * @param value The value of 'labels'.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.OssTask.Builder setLabels(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[8], value);
      this.labels = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'labels' field has been set.
      * @return True if the 'labels' field has been set, false otherwise.
      */
    public boolean hasLabels() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'labels' field.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.OssTask.Builder clearLabels() {
      labels = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'dataCover' field.
      * @return The value.
      */
    public java.util.List<java.lang.CharSequence> getDataCover() {
      return dataCover;
    }

    /**
      * Sets the value of the 'dataCover' field.
      * @param value The value of 'dataCover'.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.OssTask.Builder setDataCover(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[9], value);
      this.dataCover = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'dataCover' field has been set.
      * @return True if the 'dataCover' field has been set, false otherwise.
      */
    public boolean hasDataCover() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'dataCover' field.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.OssTask.Builder clearDataCover() {
      dataCover = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /**
      * Gets the value of the 'geoCover' field.
      * @return The value.
      */
    public java.util.List<java.lang.CharSequence> getGeoCover() {
      return geoCover;
    }

    /**
      * Sets the value of the 'geoCover' field.
      * @param value The value of 'geoCover'.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.OssTask.Builder setGeoCover(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[10], value);
      this.geoCover = value;
      fieldSetFlags()[10] = true;
      return this;
    }

    /**
      * Checks whether the 'geoCover' field has been set.
      * @return True if the 'geoCover' field has been set, false otherwise.
      */
    public boolean hasGeoCover() {
      return fieldSetFlags()[10];
    }


    /**
      * Clears the value of the 'geoCover' field.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.OssTask.Builder clearGeoCover() {
      geoCover = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    /**
      * Gets the value of the 'markets' field.
      * @return The value.
      */
    public java.util.List<java.lang.CharSequence> getMarkets() {
      return markets;
    }

    /**
      * Sets the value of the 'markets' field.
      * @param value The value of 'markets'.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.OssTask.Builder setMarkets(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[11], value);
      this.markets = value;
      fieldSetFlags()[11] = true;
      return this;
    }

    /**
      * Checks whether the 'markets' field has been set.
      * @return True if the 'markets' field has been set, false otherwise.
      */
    public boolean hasMarkets() {
      return fieldSetFlags()[11];
    }


    /**
      * Clears the value of the 'markets' field.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.OssTask.Builder clearMarkets() {
      markets = null;
      fieldSetFlags()[11] = false;
      return this;
    }

    /**
      * Gets the value of the 'molecules' field.
      * @return The value.
      */
    public java.util.List<java.lang.CharSequence> getMolecules() {
      return molecules;
    }

    /**
      * Sets the value of the 'molecules' field.
      * @param value The value of 'molecules'.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.OssTask.Builder setMolecules(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[12], value);
      this.molecules = value;
      fieldSetFlags()[12] = true;
      return this;
    }

    /**
      * Checks whether the 'molecules' field has been set.
      * @return True if the 'molecules' field has been set, false otherwise.
      */
    public boolean hasMolecules() {
      return fieldSetFlags()[12];
    }


    /**
      * Clears the value of the 'molecules' field.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.OssTask.Builder clearMolecules() {
      molecules = null;
      fieldSetFlags()[12] = false;
      return this;
    }

    /**
      * Gets the value of the 'providers' field.
      * @return The value.
      */
    public java.util.List<java.lang.CharSequence> getProviders() {
      return providers;
    }

    /**
      * Sets the value of the 'providers' field.
      * @param value The value of 'providers'.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.OssTask.Builder setProviders(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[13], value);
      this.providers = value;
      fieldSetFlags()[13] = true;
      return this;
    }

    /**
      * Checks whether the 'providers' field has been set.
      * @return True if the 'providers' field has been set, false otherwise.
      */
    public boolean hasProviders() {
      return fieldSetFlags()[13];
    }


    /**
      * Clears the value of the 'providers' field.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.OssTask.Builder clearProviders() {
      providers = null;
      fieldSetFlags()[13] = false;
      return this;
    }

    @Override
    public OssTask build() {
      try {
        OssTask record = new OssTask();
        record.assetId = fieldSetFlags()[0] ? this.assetId : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.jobId = fieldSetFlags()[1] ? this.jobId : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.traceId = fieldSetFlags()[2] ? this.traceId : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.ossKey = fieldSetFlags()[3] ? this.ossKey : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.titleIndex = fieldSetFlags()[4] ? this.titleIndex : (java.util.List<java.lang.Integer>) defaultValue(fields()[4]);
        record.fileType = fieldSetFlags()[5] ? this.fileType : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.fileName = fieldSetFlags()[6] ? this.fileName : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.sheetName = fieldSetFlags()[7] ? this.sheetName : (java.lang.CharSequence) defaultValue(fields()[7]);
        record.labels = fieldSetFlags()[8] ? this.labels : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[8]);
        record.dataCover = fieldSetFlags()[9] ? this.dataCover : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[9]);
        record.geoCover = fieldSetFlags()[10] ? this.geoCover : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[10]);
        record.markets = fieldSetFlags()[11] ? this.markets : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[11]);
        record.molecules = fieldSetFlags()[12] ? this.molecules : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[12]);
        record.providers = fieldSetFlags()[13] ? this.providers : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[13]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
