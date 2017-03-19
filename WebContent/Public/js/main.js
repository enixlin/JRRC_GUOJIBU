Ext.onReady(function() {

	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	/**
	 * 架设页面布局框架，这是一个border layout
	 */
	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	// 页头标题和用户信息
	// 退出登录按钮
	var btn_logout = Ext.create('Ext.Button', {
				text : '<font color=white>退出登录</font>',
				style : "float:right;margin:5px 3px 0 10px;background:red",
				fixed : false,
				// renderTo : Ext.getCmp('north'),
				handler : function() {
					if (confirm("确定要退出登录？") == 1) {
						window.location.href = "../login/logout.do";
					}
				}
			});

	// 变更角色按键
	var btn_change_role = Ext.create('Ext.Button', {
				text : '<font color=white>变更角色</font>',
				style : "float:right;margin:5px 3px 0 10px;background:green",
				fixed : false,
				renderTo : Ext.getCmp('north'),
				handler : function() {
					// 弹出用户角色选择窗口
					showSelectRoleWindow();

				}
			});
	// 标题
	var lable_title = {
		xtype : 'label',
		text : "国际业务信息查询系统",
		style : "color:orange;font:30px/35px heiti serif;margin:2px 3px 0 10px ",
		alignTarget : 'right'
	};
	// 登录用户信息
	var lable_userinfo = {
		xtype : 'label',
		text : "欢迎你：" + userName + "[" + "管理员" + "]",
		style : "color:black;font:13px/30px heiti serif;float:right;margin:2px 3px 0 10px"
	};
	// 顶部容器面板：放置标题和用户信息栏
	var Container_northWin = {
		region : 'north', // position for region
		xtype : 'panel',
		id : 'north',
		height : 35,
		collapsible : false,
		split : true, // enable resizing
		margin : '3 5 5 5',
		items : [ //
		btn_logout, //
				btn_change_role, //
				lable_title, //
				lable_userinfo //
		]
	};

	// 页脚版权信息
	var Container_southWin = {
		title : '江门融和银行国际业务部@2017年1月',
		titleAlign : 'center',
		region : 'south', // position for region
		xtype : 'panel',
		height : 25,
		collapsible : false,
		split : true, // enable resizing
		margin : '0 5 5 5'
	};

	// 中间内容显示区
	var Container_contentWin = Ext.create('Ext.tab.Panel', {
				width : '85%',
				region : 'center',
				id : 'contentpanel',
				split : true,
				layout : 'auto',
				height : 400,
				items : []
			});

	// 功能菜单树数据
	var function_tree_store = Ext.create('Ext.data.TreeStore', {
				root : {
					expanded : true,
					children : [{
								text : 'detention',
								leaf : true

							}, {
								text : '业绩报表',
								expanded : true,
								children : [{
											text : '2016年业绩报表',
											leaf : true

										}, {
											text : '2017年业绩报表',
											leaf : true

										}]
							}, {
								text : 'buy lottery tickets',
								leaf : true

							}]
				}
			});

	// 功能菜单面板
	var functionPanel = Ext.create('Ext.tree.Panel', {
				title : 'Simple Tree',
				width : 200,
				height : 150,
				store : function_tree_store,
				rootVisible : false,
				// 添加事件监听，打开对应的功能页面
				listeners : {
					itemclick : function(view, record, item, index, e, eOpts) {
						openTab(view, record, item, index, e, eOpts)
					}
				}

			});

	// 左则功能区
	var Container_eastWin = {
		// xtype: 'panel' implied by default
		title : '功能菜单',
		region : 'west',
		xtype : 'panel',
		margin : '0 0 0 0',
		width : '15%',
		collapsible : true, // make collapsible
		id : 'west-region-container',
		layout : 'fit',
		split : true,
		items : [functionPanel]
	}

	/**
	 * 主界面框架
	 */
	var Container = Ext.create('Ext.panel.Panel', {
				width : '100%',
				height : 600,
				style : {
					color : 'red'
				},
				layout : 'border',
				items : [Container_southWin, Container_northWin,
						Container_eastWin, Container_contentWin],
				renderTo : 'container'
			});

	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	/**
	 * 
	 */
	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	// 读取用户信息
	// 点击左则功能树，对应打开新的tab
	function openTab(view, record, item, index, e, eOpts) {
		if (record.data.leaf == true) { // 叶子节点才打开
			alert(record.data.id);
			var id = record.id;
			if (Ext.getCmp(id))// 如果已经打开了对应的tab就使该tab变成激活状态
				Container_contentWin.setActiveTab(id);
			else {
				Container_contentWin.add({
							title : record.data.text,
							// html : openTabJsp(record.data.text),
							// html:"this is tab panel",
							loader: {
									url: '../user/userlist.do?id='+record.data.id,
									loadMask: 'loading...',
									autoLoad: true,
									scripts: true
									},
							closable : true,
							id : record.data.id
						});
				Container_contentWin.setActiveTab(id); /* 激活新的选项卡 */
			}
		}
	}

	// 显示用户角色选择窗口
	function showSelectRoleWindow() {
		var selectRoleWindow = new Ext.Window({
					width : 300,
					height : 200,
					modal : true,
					items : [
					// 表格布局
					]

				});
		selectRoleWindow.show();
	}

	// 改变用户角色
	function changeUserRole(user_id, role) {

	}

	// 取得角色对应功能权限
	function getRoleFunction(user_id, role) {

	}

	// 初始化功能树
	function createFunctionTree() {

	}

	// 新打开功能窗口
	function showuser() {
		Ext.define('User1', {
					extend : 'Ext.data.Model',
					fields : [{
								name : 'id',
								type : 'string'
							}, {
								name : 'Name',
								type : 'string'
							}
					// {name: 'age', type: 'int'},
					// {name: 'eyeColor', type: 'string'}
					]
				});

		var myStore = Ext.create('Ext.data.Store', {
					model : 'User1',
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
					title : '用户管理',
					store : Ext.data.StoreManager.lookup(myStore),
					columns : [{
								text : 'id',
								dataIndex : 'id'
							}, {
								text : 'name',
								dataIndex : 'name',
								flex : 1
							}],
					height : 200,
					width : '100%',
					// renderTo: Ext.getCmp(Container_contentWin)
					renderTo : this
				});
	}

	function openTabJsp(url) {
		console.log(url);

	}

	function createTab(){
		return "<input type='button' value='bu' onClick='show()' /> <script>function show(){alert('show inner');}</script>";
	
	}
	function show() {	
		alert("show function");

	}
});
