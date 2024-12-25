package cn.net.susan.generate.mapper;

import java.util.List;

import cn.net.susan.generate.domain.ColumnInfo;
import cn.net.susan.generate.domain.TableInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * 代码生成 数据层
 *
 * @author sue
 */
public interface GenMapper {
    /**
     * 查询ry数据库表信息
     *
     * @param tableInfo 表信息
     * @return 数据库表列表
     */
    List<TableInfo> selectTableList(TableInfo tableInfo);

    /**
     * 根据表名称查询信息
     *
     * @param dataBaseName 库名称
     * @param tableName    表名称
     * @return 表信息
     */
    TableInfo selectTableByName(@Param("dataBaseName") String dataBaseName, @Param("tableName") String tableName);

    /**
     * 根据表名称查询列信息
     *
     * @param dataBaseName 库名称
     * @param tableName    表名称
     * @return 列信息
     */
    List<ColumnInfo> selectTableColumnsByName(@Param("dataBaseName") String dataBaseName, @Param("tableName") String tableName);
}
