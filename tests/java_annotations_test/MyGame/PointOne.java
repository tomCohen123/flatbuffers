// automatically generated by the FlatBuffers compiler, do not modify

package MyGame;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class PointOne extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static PointOne getRootAsPointOne(ByteBuffer _bb) { return getRootAsPointOne(_bb, new PointOne()); }
  public static PointOne getRootAsPointOne(ByteBuffer _bb, PointOne obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public PointOne __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public long x() { int o = __offset(4); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public long y() { int o = __offset(6); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }

  public static int createPointOne(FlatBufferBuilder builder,
      long x,
      long y) {
    builder.startTable(2);
    PointOne.addY(builder, y);
    PointOne.addX(builder, x);
    return PointOne.endPointOne(builder);
  }

  public static void startPointOne(FlatBufferBuilder builder) { builder.startTable(2); }
  public static void addX(FlatBufferBuilder builder, long x) { builder.addInt(0, (int) x, (int) 0L); }
  public static void addY(FlatBufferBuilder builder, long y) { builder.addInt(1, (int) y, (int) 0L); }
  public static int endPointOne(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public PointOne get(int j) { return get(new PointOne(), j); }
    public PointOne get(PointOne obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
  public PointOneT unpack() {
    PointOneT _o = new PointOneT();
    unpackTo(_o);
    return _o;
  }
  public void unpackTo(PointOneT _o) {
    long _oX = x();
    _o.setX(_oX);
    long _oY = y();
    _o.setY(_oY);
  }
  public static int pack(FlatBufferBuilder builder, PointOneT _o) {
    if (_o == null) return 0;
    return createPointOne(
      builder,
      _o.getX(),
      _o.getY());
  }
}
