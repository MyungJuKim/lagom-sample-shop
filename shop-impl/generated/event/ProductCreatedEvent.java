package event;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import java.time.Instant;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import model.Product;

/**
 * Immutable implementation of {@link ProductEvent.AbstractProductCreatedEvent}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ProductCreatedEvent.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ProductCreatedEvent.of()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "ProductEvent.AbstractProductCreatedEvent"})
@Immutable
public final class ProductCreatedEvent implements ProductEvent.AbstractProductCreatedEvent {
  private final Instant timestamp;
  private final Product product;

  private ProductCreatedEvent(Product product) {
    this.product = Preconditions.checkNotNull(product, "product");
    this.timestamp = Preconditions.checkNotNull(ProductEvent.AbstractProductCreatedEvent.super.timestamp(), "timestamp");
  }

  private ProductCreatedEvent(ProductCreatedEvent.Builder builder) {
    this.product = builder.product;
    this.timestamp = builder.timestamp != null
        ? builder.timestamp
        : Preconditions.checkNotNull(ProductEvent.AbstractProductCreatedEvent.super.timestamp(), "timestamp");
  }

  private ProductCreatedEvent(Instant timestamp, Product product) {
    this.timestamp = timestamp;
    this.product = product;
  }

  /**
   * @return The value of the {@code timestamp} attribute
   */
  @JsonProperty("timestamp")
  @Override
  public Instant timestamp() {
    return timestamp;
  }

  /**
   * @return The value of the {@code product} attribute
   */
  @JsonProperty("product")
  @Override
  public Product product() {
    return product;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ProductEvent.AbstractProductCreatedEvent#timestamp() timestamp} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for timestamp
   * @return A modified copy of the {@code this} object
   */
  public final ProductCreatedEvent withTimestamp(Instant value) {
    if (this.timestamp == value) return this;
    Instant newValue = Preconditions.checkNotNull(value, "timestamp");
    return new ProductCreatedEvent(newValue, this.product);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ProductEvent.AbstractProductCreatedEvent#product() product} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for product
   * @return A modified copy of the {@code this} object
   */
  public final ProductCreatedEvent withProduct(Product value) {
    if (this.product == value) return this;
    Product newValue = Preconditions.checkNotNull(value, "product");
    return new ProductCreatedEvent(this.timestamp, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ProductCreatedEvent} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ProductCreatedEvent
        && equalTo((ProductCreatedEvent) another);
  }

  private boolean equalTo(ProductCreatedEvent another) {
    return timestamp.equals(another.timestamp)
        && product.equals(another.product);
  }

  /**
   * Computes a hash code from attributes: {@code timestamp}, {@code product}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 31;
    h = h * 17 + timestamp.hashCode();
    h = h * 17 + product.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ProductCreatedEvent} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("ProductCreatedEvent")
        .omitNullValues()
        .add("timestamp", timestamp)
        .add("product", product)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ProductEvent.AbstractProductCreatedEvent {
    @Nullable Instant timestamp;
    @Nullable Product product;
    @JsonProperty("timestamp")
    public void setTimestamp(Instant timestamp) {
      this.timestamp = timestamp;
    }
    @JsonProperty("product")
    public void setProduct(Product product) {
      this.product = product;
    }
    @Override
    public Instant timestamp() { throw new UnsupportedOperationException(); }
    @Override
    public Product product() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ProductCreatedEvent fromJson(Json json) {
    ProductCreatedEvent.Builder builder = ProductCreatedEvent.builder();
    if (json.timestamp != null) {
      builder.timestamp(json.timestamp);
    }
    if (json.product != null) {
      builder.product(json.product);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code ProductCreatedEvent} instance.
   * @param product The value for the {@code product} attribute
   * @return An immutable ProductCreatedEvent instance
   */
  public static ProductCreatedEvent of(Product product) {
    return new ProductCreatedEvent(product);
  }

  /**
   * Creates an immutable copy of a {@link ProductEvent.AbstractProductCreatedEvent} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ProductCreatedEvent instance
   */
  public static ProductCreatedEvent copyOf(ProductEvent.AbstractProductCreatedEvent instance) {
    if (instance instanceof ProductCreatedEvent) {
      return (ProductCreatedEvent) instance;
    }
    return ProductCreatedEvent.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ProductCreatedEvent ProductCreatedEvent}.
   * @return A new ProductCreatedEvent builder
   */
  public static ProductCreatedEvent.Builder builder() {
    return new ProductCreatedEvent.Builder();
  }

  /**
   * Builds instances of type {@link ProductCreatedEvent ProductCreatedEvent}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_PRODUCT = 0x1L;
    private long initBits = 0x1L;

    private @Nullable Instant timestamp;
    private @Nullable Product product;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AbstractProductCreatedEvent} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ProductEvent.AbstractProductCreatedEvent instance) {
      Preconditions.checkNotNull(instance, "instance");
      timestamp(instance.timestamp());
      product(instance.product());
      return this;
    }

    /**
     * Initializes the value for the {@link ProductEvent.AbstractProductCreatedEvent#timestamp() timestamp} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link ProductEvent.AbstractProductCreatedEvent#timestamp() timestamp}.</em>
     * @param timestamp The value for timestamp 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder timestamp(Instant timestamp) {
      this.timestamp = Preconditions.checkNotNull(timestamp, "timestamp");
      return this;
    }

    /**
     * Initializes the value for the {@link ProductEvent.AbstractProductCreatedEvent#product() product} attribute.
     * @param product The value for product 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder product(Product product) {
      this.product = Preconditions.checkNotNull(product, "product");
      initBits &= ~INIT_BIT_PRODUCT;
      return this;
    }

    /**
     * Builds a new {@link ProductCreatedEvent ProductCreatedEvent}.
     * @return An immutable instance of ProductCreatedEvent
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ProductCreatedEvent build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ProductCreatedEvent(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_PRODUCT) != 0) attributes.add("product");
      return "Cannot build ProductCreatedEvent, some of required attributes are not set " + attributes;
    }
  }
}
