Ext.onReady(function() {

	var northWin = Ext.getCmp();
	
	 


	
	var store = Ext.create('Ext.data.TreeStore', {
	    root: {
	        expanded: true,
	        children: [
	            { text: 'detention', leaf: true },
	            { text: 'homework', expanded: true, children: [
	                { text: 'book report', leaf: true },
	                { text: 'algebra', leaf: true}
	            ] },
	            { text: 'buy lottery tickets', leaf: true }
	        ]
	    }
	});

	/**
	 * 左则功能菜单
	 */
	var leftWin =Ext.create('Ext.tree.Panel', {
	    title: 'Simple Tree',
	    width: 200,
	    height: 150,
	    store: store,
	    rootVisible: false,
	   // renderTo : 'container'
	});
	

	/**
	 * 主界面框架
	 */
	var Container = Ext.create('Ext.panel.Panel', {
				width : '100%',
				height : 600,
				// title : '<font color=# size=3>江门融和银行国际业务部信息查询系统</font>',
				style : {
					color : 'red'
				},
				layout : 'border',
				items : [

						// 页头信息
					{
					region : 'north', // position for region
					xtype : 'panel',
					id : 'north',
					height : 35,
					layout : {
						type : 'fit',
						align : 'right'
					},

					collapsible : false,
					split : true, // enable resizing
					margin : '3 5 5 5',

					items : [{
								xtype : 'label',
								text : "国际业务信息查询系统",
								style : "color:orange;font:30px/30px heiti serif",
								alignTarget : 'right'
							}, {
								xtype : 'label',
								text : "欢迎你：",
								style : "color:black;font:13px/30px heiti serif"
							}, {
								xtype : 'button',
								text : 'add acc',
								renderTo : 'add',
								handler : function() {
									alert("acc click");
								}
							}

					]
				},

						// 页脚版权信息
						{
							title : '江门融和银行国际业务部@2017年1月',
							titleAlign : 'center',
							region : 'south', // position for region
							xtype : 'panel',
							height : 25,
							collapsible : false,
							split : true, // enable resizing
							margin : '0 5 5 5'
						},
						// 左则功能菜单
						{
							// xtype: 'panel' implied by default
							title : '功能菜单',
							region : 'west',
							xtype : 'panel',
							margin : '0 0 0 0',
							width : 200,
							collapsible : true, // make collapsible
							id : 'west-region-container',
							layout : 'fit',
							split : true,
							items : [leftWin]
						},

						// 中间内容显示区
						{
							// title : 'Center Region',
							region : 'center', // center region is
							xtype : 'tabpanel',
							id : 'tabpanel',
							layout : 'fit',
							items : []

						}],
				renderTo : 'container'
			});
	//

	getpower();
	function getpower() {
		Ext.Ajax.request({
					url : 'getUserPowers.do',

					success : function(response, opts) {
						var obj = Ext.decode(response.responseText);
						console.log(obj);
						var item = [];
						for (var n = 0; n < obj.length; n++) {
							// console.log(obj[n].name);
							item.push({
										title : obj[n].powername,
										// title : 'Panel 1',
										html : '<a id=' + obj[n].powername 
												+ ' href=#>' + obj[n].url
												+ '</a>'

									});

						};
						console.log(item);
						var tabpanel = Ext.getCmp('leftWin');
						tabpanel.removeAll();
						tabpanel.add(item);
						console.dir(obj);
					},

					failure : function(response, opts) {
						console.log('server-side failure with status code '
								+ response.status);
					}
				});
	};

	var tit = Ext.getCmp('通信录');
	tit.on({'click':function(){alert('tonc')}});
});



	



















