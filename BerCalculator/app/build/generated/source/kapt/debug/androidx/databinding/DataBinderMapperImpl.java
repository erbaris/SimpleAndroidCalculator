package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.erbaris.android.app.calculator.DataBinderMapperImpl());
  }
}
