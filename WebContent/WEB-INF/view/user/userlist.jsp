<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<script type="text/javascript">
	var idd = '${id}';

		var d = idd;
		Ext.define(d, {
			extend : 'Ext.data.Model',
			fields : [ {
				name : 'id',
				type : 'string'
			}, {
				name : 'Name',
				type : 'string'
			}
			]
		});

		var myStore = Ext.create('Ext.data.Store', {
			model : d,
			proxy : {
				type : 'ajax',
				url : '../user/getNames.do',
				reader : {
					type : 'json'
				}
			},
			autoLoad : true
		});
		Ext.create('Ext.grid.Panel', {
			title : '<span text-align=center>用户管理</span>',
			store : Ext.data.StoreManager.lookup(myStore),
			columns : [ {
				text : 'id',
				dataIndex : 'id'
			}, {
				text : 'name',
				dataIndex : 'name',
				flex : 1
			} ],
			height : 400,
			width : '100%',
			renderTo : Ext.fly(d + "-innerCt")
		});


</script>