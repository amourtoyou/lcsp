package com.yx.lcsp.mapper;

import com.yx.lcsp.handler.Handle1001;
import com.yx.lcsp.modal.*;
import com.yx.lcsp.rqt.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    //返回标准的单行数据
    @Select("call demo_handle_single(#{arg0}, #{arg1})")
    ResultItem handleSingle(Rqt9001 rqt);

    //返回多行数据列表
    @Select("call demo_handle_muti(#{gltj})")
    List<ZdItem> handleMuti(Rqt9002 rqt);

    @Select("call lcsp_login_verify(#{type},#{usr},#{pwd})")
    ResultItem login(Rqt1001 rqt);

    @Select("call lcsp_xyk_new(#{key},#{kh},#{xh},#{xm},#{xb},#{csrq},#{yxxx})")
    ResultItem AddXyk(Rqt1002 rqt);

    @Select("call lcsp_xyk_upt(#{key},#{id},#{zt},#{msg})")
    ResultItem chgXyk(Rqt1003 rqt);

    @Select("call lcsp_xyk_lst(#{key},#{cgl1},#{cgl2})")
    List<Tbxyk> getxyk(Rqt1004 rqt);

    @Select("call lcsp_mjk_new(#{key},#{kh},#{xh},#{xm},#{xb},#{csrq},#{yxxx})")
    ResultItem addmjk(Rqt1005 rqt);

    @Select("call lcsp_mjk_upt(#{key},#{id},#{zt},#{msg})")
    ResultItem chgmjk(Rqt1006 rqt);

    @Select("call lcsp_mjk_lst(#{key},#{cgl1},#{cgl2})")
    List<Tbmjk> getmjk(Rqt1004 rqt);

    @Select("call lcsp_fwq_new(#{key},#{xh},#{xm},#{xb},#{csrq},#{yxxx})")
    ResultItem addfwq(Rqt1008 rqt);

    @Select("call lcsp_fwq_upt(#{key},#{id},#{zt},#{msg})")
    ResultItem chgfwq(Rqt1006 rqt);

    @Select("call lcsp_fwq_lst(#{key},#{cgl1},#{cgl2})")
    List<Tbfwq> getfwq(Rqt1004 rqt);

    @Select("call lcsp_dz_new(#{key},#{xh},#{xm},#{xb},#{csrq},#{yxxx},#{sqdz},#{yysj})")
    ResultItem adddz(Rqt1011 rqt);

    @Select("call lcsp_dz_upt(#{key},#{id},#{zt},#{msg})")
    ResultItem chgdz(Rqt1006 rqt);

    @Select("call lcsp_dz_lst(#{key},#{cgl1},#{cgl2})")
    List<Tbdz> getdz(Rqt1004 rqt);

    @Select("call lcsp_psd_new(#{key},#{xh},#{xm},#{user},#{opsd},#{type},#{npsd},#{bz})")
    ResultItem addpsd(Rqt1014 rqt);

    @Select("call lcsp_psd_upt(#{key},#{id},#{zt},#{msg})")
    ResultItem chgpsd(Rqt1006 rqt);

    @Select("call lcsp_psd_lst(#{key},#{cgl1},#{cgl2})")
    List<Tbpsd> getpsd(Rqt1004 rqt);

    @Select("call lcsp_count_get(#{key})")
    Count getcount(Rqt2001 rqt);

    @Select("call admin_tbxyk_get(#{key},#{id})")
    Tbxyk getxykid(Rqt2002 rqt);

    @Select("call admin_mjk_get(#{key},#{id})")
    Tbmjk getmjkid(Rqt2002 rqt);

    @Select("call admin_dz_get(#{key},#{id})")
    Tbdz getdzid(Rqt2002 rqt);

    @Select("call admin_fwq_get(#{key},#{id})")
    Tbfwq getfwqid(Rqt2002 rqt);

    @Select("call admin_psd_get(#{key},#{id})")
    Tbpsd getpsdid(Rqt2002 rqt);

    @Select("call admin_all_get(#{key})")
    List<UnionAll> getAllOrder(Rqt2001 rqt);

    @Select("call admin_tj_get()")
    List<TongJi> gettongji();
}
